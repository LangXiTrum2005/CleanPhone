package com.p004ironsource;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u000b\b\u0080\u0001\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003B\u0011\b\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/ironsource/qg;", "", "", "a", "I", "b", "()I", "id", "<init>", "(Ljava/lang/String;II)V", "c", "d", "e", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public enum qg {
    UnknownProvider(0),
    DeliverySonic(1),
    MarketPlaceISX(3);


    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int id;

    /* JADX INFO: renamed from: com.ironsource.qg$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007¨\u0006\u000b"}, d2 = {"Lcom/ironsource/qg$a;", "", "", "value", "Lcom/ironsource/qg;", "a", "(Ljava/lang/Integer;)Lcom/ironsource/qg;", "", "dynamicDemandSourceId", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        private Companion() {
        }

        /* JADX WARN: Code duplicated, block: B:13:0x001e  */
        /* JADX WARN: Code duplicated, block: B:15:0x0021 A[RETURN] */
        public final qg a(Integer value) {
            for (qg qgVar : qg.values()) {
                int id = qgVar.getId();
                if (value != null && id == value.intValue()) {
                    if (qgVar == null) {
                        return qg.UnknownProvider;
                    }
                    return qgVar;
                }
            }
            qgVar = null;
            if (qgVar == null) {
                return qg.UnknownProvider;
            }
            return qgVar;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final qg a(String dynamicDemandSourceId) {
            Intrinsics.f(dynamicDemandSourceId, "dynamicDemandSourceId");
            List listJ = StringsKt.J(dynamicDemandSourceId, 0, 6, new String[]{"_"});
            return listJ.size() < 2 ? qg.UnknownProvider : a(StringsKt.Y((String) listJ.get(1)));
        }
    }

    qg(int i2) {
        this.id = i2;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getId() {
        return this.id;
    }
}
