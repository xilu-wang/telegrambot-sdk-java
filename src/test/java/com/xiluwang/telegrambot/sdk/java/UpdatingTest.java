package com.xiluwang.telegrambot.sdk.java;

import com.xiluwang.telegrambot.sdk.model.updates.Update;
import com.xiluwang.telegrambot.sdk.updating.UpdateUtil;
import com.xiluwang.telegrambot.sdk.utility.TestUtility;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.io.IOException;
import java.time.Instant;

@Slf4j
public class UpdatingTest {

    @Test
    public void updatingForEveryTwoSecond()
            throws IOException, InterruptedException {
        log.info("STARTING UP UPDATER...");
        Integer next = init();

        while (true) {
            next = updater(next);
            Thread.sleep(2000);
        }
    }

    private Integer init() throws IOException {
        Update[] initUpdates = UpdateUtil.getUpdates();
        if (initUpdates != null && initUpdates.length > 0) {
            log.info("UPDATES FROM LAST UPDATES:");
            TestUtility.prettyPrintObject(initUpdates);
            return initUpdates[initUpdates.length - 1].getUpdate_id() + 1;
        }
        return null;
    }

    private Integer updater(Integer offset) throws IOException {
        Update[] updates =  offset == null ? UpdateUtil.getUpdates() :
                UpdateUtil.getUpdatesWithOffset(offset);
        if (updates != null && updates.length > 0) {
            log.info("NEW UPDATE ----- {}", Instant.now());
            TestUtility.prettyPrintObject(updates);
            return updates[updates.length - 1].getUpdate_id() + 1;
        }
        return offset;
    }
}
