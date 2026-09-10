package androidx.compose.runtime;

import p002kotlin.Metadata;
import p002kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: SlotTable.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0081@\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u000f\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0011"}, d2 = {"Landroidx/compose/runtime/achondroplasia;", "", "Landroidx/collection/oilcan;", "list", "saneness", "(Landroidx/collection/oilcan;)Landroidx/collection/oilcan;", "", "value", "", "attabal", "(Landroidx/collection/oilcan;I)V", "", "wireman", "(Landroidx/collection/oilcan;)Z", "marial", "(Landroidx/collection/oilcan;)I", "beachfront", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class achondroplasia {
    public static final void attabal(androidx.collection.oilcan oilcanVar, int i) {
        if (oilcanVar._size == 0 || !(oilcanVar.saneness(0) == i || oilcanVar.saneness(oilcanVar._size - 1) == i)) {
            int i2 = oilcanVar._size;
            oilcanVar.impromptu(i);
            while (i2 > 0) {
                int i3 = ((i2 + 1) >>> 1) - 1;
                int iSaneness = oilcanVar.saneness(i3);
                if (i <= iSaneness) {
                    break;
                }
                oilcanVar.triweekly(i2, iSaneness);
                i2 = i3;
            }
            oilcanVar.triweekly(i2, i);
        }
    }

    public static final int beachfront(androidx.collection.oilcan oilcanVar) {
        int iSaneness;
        int i = oilcanVar._size;
        int iSaneness2 = oilcanVar.saneness(0);
        while (oilcanVar._size != 0 && oilcanVar.saneness(0) == iSaneness2) {
            oilcanVar.triweekly(0, oilcanVar.competently());
            oilcanVar.formularize(oilcanVar._size - 1);
            int i2 = oilcanVar._size;
            int i3 = i2 >>> 1;
            int i4 = 0;
            while (i4 < i3) {
                int iSaneness3 = oilcanVar.saneness(i4);
                int i5 = (i4 + 1) * 2;
                int i6 = i5 - 1;
                int iSaneness4 = oilcanVar.saneness(i6);
                if (i5 < i2 && (iSaneness = oilcanVar.saneness(i5)) > iSaneness4) {
                    if (iSaneness <= iSaneness3) {
                        break;
                    }
                    oilcanVar.triweekly(i4, iSaneness);
                    oilcanVar.triweekly(i5, iSaneness3);
                    i4 = i5;
                } else {
                    if (iSaneness4 <= iSaneness3) {
                        break;
                    }
                    oilcanVar.triweekly(i4, iSaneness4);
                    oilcanVar.triweekly(i6, iSaneness3);
                    i4 = i6;
                }
            }
        }
        return iSaneness2;
    }

    public static /* synthetic */ androidx.collection.oilcan dern(androidx.collection.oilcan oilcanVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        int i2 = 1;
        if ((i & 1) != 0) {
            oilcanVar = new androidx.collection.oilcan(0, i2, null);
        }
        return saneness(oilcanVar);
    }

    public static final int marial(androidx.collection.oilcan oilcanVar) {
        return oilcanVar.attabal();
    }

    public static final boolean wireman(androidx.collection.oilcan oilcanVar) {
        return oilcanVar._size != 0;
    }

    public static androidx.collection.oilcan saneness(androidx.collection.oilcan oilcanVar) {
        return oilcanVar;
    }
}
