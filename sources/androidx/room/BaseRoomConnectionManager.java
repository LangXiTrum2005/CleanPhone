package androidx.room;

import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteDriver;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Landroidx/room/BaseRoomConnectionManager;", "", "DriverWrapper", "Companion", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class BaseRoomConnectionManager {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/room/BaseRoomConnectionManager$Companion;", "", "", "BUSY_TIMEOUT_MS", "I", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0084\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/room/BaseRoomConnectionManager$DriverWrapper;", "Landroidx/sqlite/SQLiteDriver;", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class DriverWrapper implements SQLiteDriver {
        @Override // androidx.sqlite.SQLiteDriver
        public final SQLiteConnection open(String fileName) {
            Intrinsics.f(fileName, "fileName");
            throw null;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[RoomDatabase.JournalMode.values().length];
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                RoomDatabase.JournalMode journalMode = RoomDatabase.JournalMode.X;
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }
}
