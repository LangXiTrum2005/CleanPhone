package androidx.paging;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"paging-common_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class SeparatorsKt {
    public static final void a(List list, Object obj, TransformablePage transformablePage, TransformablePage transformablePage2, int i2, int i3) {
        Intrinsics.f(list, "<this>");
        int[] iArrH0 = transformablePage != null ? transformablePage.f7886a : null;
        int[] iArr = transformablePage2 != null ? transformablePage2.f7886a : null;
        if (iArrH0 != null && iArr != null) {
            int length = iArrH0.length;
            int length2 = iArr.length;
            int[] iArrCopyOf = Arrays.copyOf(iArrH0, length + length2);
            System.arraycopy(iArr, 0, iArrCopyOf, length, length2);
            Intrinsics.c(iArrCopyOf);
            LinkedHashSet linkedHashSet = new LinkedHashSet(MapsKt.h(iArrCopyOf.length));
            for (int i4 : iArrCopyOf) {
                linkedHashSet.add(Integer.valueOf(i4));
            }
            iArrH0 = CollectionsKt.h0(CollectionsKt.b0(CollectionsKt.i0(linkedHashSet)));
        } else if (iArrH0 == null && iArr != null) {
            iArrH0 = iArr;
        } else if (iArrH0 == null || iArr != null) {
            throw new IllegalArgumentException("Separator page expected adjacentPageBefore or adjacentPageAfter, but both were null.");
        }
        if (obj == null) {
            return;
        }
        list.add(new TransformablePage(iArrH0, CollectionsKt.H(obj), i2, CollectionsKt.H(Integer.valueOf(i3))));
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0088  */
    /* JADX WARN: Code duplicated, block: B:25:0x00ac A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:26:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:28:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00ad -> B:27:0x00b0). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object b(androidx.paging.TransformablePage r11, kotlin.coroutines.jvm.internal.ContinuationImpl r12) {
        /*
            Method dump skipped, instruction units count: 227
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.SeparatorsKt.b(androidx.paging.TransformablePage, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
