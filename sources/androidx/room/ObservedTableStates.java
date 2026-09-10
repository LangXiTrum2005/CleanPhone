package androidx.room;

import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/room/ObservedTableStates;", "", "ObserveOp", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ObservedTableStates {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[] f8204b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean[] f8205c;
    public volatile boolean d;
    public volatile boolean f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ReentrantLock f8203a = new ReentrantLock();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ReentrantLock f8206e = new ReentrantLock();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/room/ObservedTableStates$ObserveOp;", "", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ObserveOp {
        public static final ObserveOp X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public static final ObserveOp f8207Y;
        public static final ObserveOp Z;
        public static final /* synthetic */ ObserveOp[] e0;
        public static final /* synthetic */ EnumEntries f0;

        static {
            ObserveOp observeOp = new ObserveOp("NO_OP", 0);
            X = observeOp;
            ObserveOp observeOp2 = new ObserveOp("ADD", 1);
            f8207Y = observeOp2;
            ObserveOp observeOp3 = new ObserveOp("REMOVE", 2);
            Z = observeOp3;
            ObserveOp[] observeOpArr = {observeOp, observeOp2, observeOp3};
            e0 = observeOpArr;
            f0 = EnumEntriesKt.a(observeOpArr);
        }

        public static ObserveOp valueOf(String str) {
            return (ObserveOp) Enum.valueOf(ObserveOp.class, str);
        }

        public static ObserveOp[] values() {
            return (ObserveOp[]) e0.clone();
        }
    }

    public ObservedTableStates(int i2) {
        this.f8204b = new long[i2];
        this.f8205c = new boolean[i2];
    }
}
