package dispope;

import android.database.AbstractWindowedCursor;
import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.RoomDatabase;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;

/* JADX INFO: compiled from: DBUtil.java */
/* JADX INFO: loaded from: classes.dex */
public class dern {
    public static void attabal(iconoclasm.saneness sanenessVar) {
        ArrayList<String> arrayList = new ArrayList();
        Cursor cursorCoffeecake = sanenessVar.coffeecake("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (cursorCoffeecake.moveToNext()) {
            try {
                arrayList.add(cursorCoffeecake.getString(0));
            } catch (Throwable th) {
                cursorCoffeecake.close();
                throw th;
            }
        }
        cursorCoffeecake.close();
        for (String str : arrayList) {
            if (str.startsWith("room_fts_content_sync_")) {
                sanenessVar.impassible("DROP TRIGGER IF EXISTS " + str);
            }
        }
    }

    public static int dern(File file) throws Throwable {
        Throwable th;
        FileChannel fileChannel = null;
        try {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
            FileChannel channel = new FileInputStream(file).getChannel();
            try {
                channel.tryLock(60L, 4L, true);
                channel.position(60L);
                if (channel.read(byteBufferAllocate) != 4) {
                    throw new IOException("Bad database header, unable to read 4 bytes at offset 60");
                }
                byteBufferAllocate.rewind();
                int i = byteBufferAllocate.getInt();
                channel.close();
                return i;
            } catch (Throwable th2) {
                th = th2;
                fileChannel = channel;
                if (fileChannel == null) {
                    throw th;
                }
                fileChannel.close();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static Cursor saneness(RoomDatabase roomDatabase, iconoclasm.marial marialVar, boolean z, CancellationSignal cancellationSignal) {
        Cursor cursorMonoploid = roomDatabase.monoploid(marialVar, cancellationSignal);
        if (!z || !(cursorMonoploid instanceof AbstractWindowedCursor)) {
            return cursorMonoploid;
        }
        AbstractWindowedCursor abstractWindowedCursor = (AbstractWindowedCursor) cursorMonoploid;
        int count = abstractWindowedCursor.getCount();
        return (abstractWindowedCursor.hasWindow() ? abstractWindowedCursor.getWindow().getNumRows() : count) < count ? saneness.attabal(abstractWindowedCursor) : cursorMonoploid;
    }
}
