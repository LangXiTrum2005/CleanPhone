package com.p004ironsource;

import com.smartdigimkt.h5.f;
import com.smartdigimkt.m3.h;
import com.thinkup.core.common.om.n;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0001\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\u0019\b\u0002\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\bR\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, d2 = {"Lcom/ironsource/o8;", "", "", "duration", "", "a", "(Ljava/lang/Integer;)J", "", "Ljava/lang/String;", "unit", "b", "J", "millis", "<init>", "(Ljava/lang/String;ILjava/lang/String;J)V", "c", "d", "e", f.j, "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public enum o8 {
    Day("d", 86400000),
    Hour(h.f36614b, n.m),
    Second("s", 1000);


    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String unit;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final long millis;

    /* JADX INFO: renamed from: com.ironsource.o8$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¨\u0006\b"}, d2 = {"Lcom/ironsource/o8$a;", "", "", "value", "Lcom/ironsource/o8;", "a", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        private Companion() {
        }

        public final o8 a(String value) {
            for (o8 o8Var : o8.values()) {
                if (Intrinsics.a(o8Var.unit, value)) {
                    return o8Var;
                }
            }
            return null;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    o8(String str, long j) {
        this.unit = str;
        this.millis = j;
    }

    public static /* synthetic */ long a(o8 o8Var, Integer num, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: inMilliseconds");
        }
        if ((i2 & 1) != 0) {
            num = 1;
        }
        return o8Var.a(num);
    }

    public final long a(Integer duration) {
        return ((long) (duration != null ? duration.intValue() : 1)) * this.millis;
    }
}
