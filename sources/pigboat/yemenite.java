package pigboat;

import p002kotlin.Metadata;
import p002kotlin.text.StringsKt;

/* JADX INFO: compiled from: SystemProps.common.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0005\u001a\u001f\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a3\u0010\t\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\n\u001a3\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u000b2\b\b\u0002\u0010\u0007\u001a\u00020\u000b2\b\b\u0002\u0010\b\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u001f\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"", "propertyName", "", "defaultValue", "wireman", "(Ljava/lang/String;Z)Z", "", "minValue", "maxValue", "attabal", "(Ljava/lang/String;III)I", "", "saneness", "(Ljava/lang/String;JJJ)J", "dern", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "kotlinx-coroutines-core"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "kotlinx/coroutines/internal/SystemPropsKt")
public final /* synthetic */ class yemenite {
    public static final int attabal(String str, int i, int i2, int i3) {
        return (int) trm.dern(str, i, i2, i3);
    }

    public static /* synthetic */ long beachfront(String str, long j, long j2, long j3, int i, Object obj) {
        if ((i & 4) != 0) {
            j2 = 1;
        }
        long j4 = j2;
        if ((i & 8) != 0) {
            j3 = Long.MAX_VALUE;
        }
        return trm.dern(str, j, j4, j3);
    }

    public static final String dern(String str, String str2) {
        String strWireman = trm.wireman(str);
        return strWireman == null ? str2 : strWireman;
    }

    public static /* synthetic */ int marial(String str, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            i2 = 1;
        }
        if ((i4 & 8) != 0) {
            i3 = Integer.MAX_VALUE;
        }
        return trm.saneness(str, i, i2, i3);
    }

    public static final long saneness(String str, long j, long j2, long j3) {
        String strWireman = trm.wireman(str);
        if (strWireman == null) {
            return j;
        }
        Long lGraveside = StringsKt.graveside(strWireman);
        if (lGraveside == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + strWireman + '\'').toString());
        }
        long jLongValue = lGraveside.longValue();
        if (j2 <= jLongValue && jLongValue <= j3) {
            return jLongValue;
        }
        throw new IllegalStateException(("System property '" + str + "' should be in range " + j2 + ".." + j3 + ", but is '" + jLongValue + '\'').toString());
    }

    public static final boolean wireman(String str, boolean z) {
        String strWireman = trm.wireman(str);
        return strWireman != null ? Boolean.parseBoolean(strWireman) : z;
    }
}
