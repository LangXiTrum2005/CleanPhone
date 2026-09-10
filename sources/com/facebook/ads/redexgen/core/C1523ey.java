package com.facebook.ads.redexgen.core;

import android.os.Bundle;
import android.util.SparseArray;
import com.google.android.material.internal.ParcelableSparseArray;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ey, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1523ey {
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static <T extends InterfaceC0904Nb> OI<T> A01(InterfaceC0903Na<T> interfaceC0903Na, List<Bundle> list) {
        C4T c4tA01 = OI.A01();
        for (int i = 0; i < list.size(); i++) {
            c4tA01.A04(interfaceC0903Na.A6V((Bundle) AbstractC1517es.A01(list.get(i))));
        }
        return c4tA01.A05();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Na != com.google.android.exoplayer2.Bundleable$Creator<T extends com.facebook.ads.redexgen.X.Nb> */
    public static <T extends InterfaceC0904Nb> SparseArray<T> A00(InterfaceC0903Na<T> interfaceC0903Na, SparseArray<Bundle> sparseArray) {
        ParcelableSparseArray parcelableSparseArray = (SparseArray<T>) new SparseArray(sparseArray.size());
        for (int i = 0; i < sparseArray.size(); i++) {
            parcelableSparseArray.put(sparseArray.keyAt(i), interfaceC0903Na.A6V(sparseArray.valueAt(i)));
        }
        return parcelableSparseArray;
    }

    public static void A02(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader((ClassLoader) AbstractC1600gE.A0f(C1523ey.class.getClassLoader()));
        }
    }
}
