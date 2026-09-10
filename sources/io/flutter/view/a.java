package io.flutter.view;

import android.opengl.Matrix;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import com.applovin.shadow.okio.Segment;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import d5.u;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class a implements ni.i, ni.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f43416a;

    public /* synthetic */ a(Object obj) {
        this.f43416a = obj;
    }

    public void a(ByteBuffer byteBuffer, String[] strArr, ByteBuffer[] byteBufferArr) {
        int i10;
        Iterator it;
        f fVar;
        int i11;
        int i12;
        f fVar2;
        String str;
        float f10;
        float f11;
        View viewB0;
        Integer num;
        View viewB1;
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        for (ByteBuffer byteBuffer2 : byteBufferArr) {
            byteBuffer2.order(ByteOrder.LITTLE_ENDIAN);
        }
        g gVar = (g) this.f43416a;
        HashMap map = gVar.f43485g;
        io.flutter.plugin.platform.h hVar = gVar.f43483e;
        ArrayList arrayList = gVar.f43494q;
        ArrayList arrayList2 = new ArrayList();
        while (byteBuffer.hasRemaining()) {
            f fVarC = gVar.c(byteBuffer.getInt());
            ArrayList arrayList3 = fVarC.U;
            g gVar2 = fVarC.f43450a;
            fVarC.E = true;
            fVarC.K = fVarC.f43469r;
            fVarC.L = fVarC.f43467p;
            fVarC.F = fVarC.f43454c;
            fVarC.G = fVarC.f43456d;
            fVarC.H = fVarC.f43459g;
            fVarC.I = fVarC.f43460h;
            fVarC.J = fVarC.l;
            fVarC.f43454c = byteBuffer.getLong();
            fVarC.f43456d = byteBuffer.getInt();
            fVarC.f43457e = byteBuffer.getInt();
            fVarC.f43458f = byteBuffer.getInt();
            fVarC.f43459g = byteBuffer.getInt();
            fVarC.f43460h = byteBuffer.getInt();
            fVarC.f43461i = byteBuffer.getInt();
            fVarC.f43462j = byteBuffer.getInt();
            fVarC.f43463k = byteBuffer.getInt();
            byteBuffer.getInt();
            fVarC.l = byteBuffer.getFloat();
            fVarC.f43464m = byteBuffer.getFloat();
            fVarC.f43465n = byteBuffer.getFloat();
            fVarC.f43466o = g.d(byteBuffer, strArr);
            fVarC.f43467p = g.d(byteBuffer, strArr);
            fVarC.f43468q = f.f(byteBuffer, byteBufferArr);
            fVarC.f43469r = g.d(byteBuffer, strArr);
            fVarC.f43470s = f.f(byteBuffer, byteBufferArr);
            fVarC.f43471t = g.d(byteBuffer, strArr);
            fVarC.f43472u = f.f(byteBuffer, byteBufferArr);
            fVarC.f43473v = g.d(byteBuffer, strArr);
            fVarC.f43474w = f.f(byteBuffer, byteBufferArr);
            fVarC.f43475x = g.d(byteBuffer, strArr);
            fVarC.f43476y = f.f(byteBuffer, byteBufferArr);
            fVarC.f43477z = g.d(byteBuffer, strArr);
            fVarC.A = g.d(byteBuffer, strArr);
            fVarC.B = g.d(byteBuffer, strArr);
            fVarC.C = byteBuffer.getInt();
            byteBuffer.getInt();
            fVarC.M = byteBuffer.getFloat();
            fVarC.N = byteBuffer.getFloat();
            fVarC.O = byteBuffer.getFloat();
            fVarC.P = byteBuffer.getFloat();
            float[] fArr = fVarC.Q;
            if (fArr == null) {
                fArr = new float[16];
            }
            for (int i13 = 0; i13 < 16; i13++) {
                fArr[i13] = byteBuffer.getFloat();
            }
            fVarC.Q = fArr;
            float[] fArr2 = fVarC.R;
            if (fArr2 == null) {
                fArr2 = new float[16];
            }
            for (int i14 = 0; i14 < 16; i14++) {
                fArr2[i14] = byteBuffer.getFloat();
            }
            fVarC.R = fArr2;
            fVarC.Y = true;
            fVarC.f43451a0 = true;
            int i15 = byteBuffer.getInt();
            ArrayList arrayList4 = fVarC.T;
            arrayList4.clear();
            for (int i16 = 0; i16 < i15; i16++) {
                f fVarC2 = gVar2.c(byteBuffer.getInt());
                fVarC2.S = fVarC;
                arrayList4.add(fVarC2);
            }
            int i17 = byteBuffer.getInt();
            arrayList3.clear();
            for (int i18 = 0; i18 < i17; i18++) {
                f fVarC3 = gVar2.c(byteBuffer.getInt());
                fVarC3.S = fVarC;
                arrayList3.add(fVarC3);
            }
            int i19 = byteBuffer.getInt();
            if (i19 == 0) {
                fVarC.V = null;
            } else {
                ArrayList arrayList5 = fVarC.V;
                if (arrayList5 == null) {
                    fVarC.V = new ArrayList(i19);
                } else {
                    arrayList5.clear();
                }
                for (int i20 = 0; i20 < i19; i20++) {
                    e eVarB = gVar2.b(byteBuffer.getInt());
                    int i21 = eVarB.f43447c;
                    if (i21 == 1) {
                        fVarC.W = eVarB;
                    } else if (i21 == 2) {
                        fVarC.X = eVarB;
                    } else {
                        fVarC.V.add(eVarB);
                    }
                    fVarC.V.add(eVarB);
                }
            }
            if (!fVarC.g(14)) {
                if (fVarC.g(6)) {
                    gVar.f43491n = fVarC;
                }
                if (fVarC.E) {
                    arrayList2.add(fVarC);
                }
                int i22 = fVarC.f43461i;
                if (i22 != -1 && !hVar.t0(i22) && (viewB1 = hVar.b0(fVarC.f43461i)) != null) {
                    viewB1.setImportantForAccessibility(0);
                }
            }
        }
        HashSet hashSet = new HashSet();
        f fVar3 = (f) map.get(0);
        ArrayList<f> arrayList6 = new ArrayList();
        if (fVar3 != null) {
            float[] fArr3 = new float[16];
            Matrix.setIdentityM(fArr3, 0);
            fVar3.k(fArr3, hashSet, false);
            fVar3.c(arrayList6);
        }
        f fVar4 = null;
        for (f fVar5 : arrayList6) {
            if (!arrayList.contains(Integer.valueOf(fVar5.f43452b))) {
                fVar4 = fVar5;
            }
        }
        if (fVar4 == null && !arrayList6.isEmpty()) {
            fVar4 = (f) l1.d.d(arrayList6, 1);
        }
        if (fVar4 != null && (fVar4.f43452b != gVar.f43495r || arrayList6.size() != arrayList.size())) {
            gVar.f43495r = fVar4.f43452b;
            String strE = fVar4.e();
            if (strE == null) {
                strE = " ";
            }
            gVar.f43479a.setAccessibilityPaneTitle(strE);
        }
        arrayList.clear();
        Iterator it2 = arrayList6.iterator();
        while (it2.hasNext()) {
            arrayList.add(Integer.valueOf(((f) it2.next()).f43452b));
        }
        Iterator it3 = map.entrySet().iterator();
        while (true) {
            i10 = 4;
            if (!it3.hasNext()) {
                break;
            }
            f fVar6 = (f) ((Map.Entry) it3.next()).getValue();
            if (!hashSet.contains(fVar6)) {
                fVar6.S = null;
                if (fVar6.f43461i != -1 && (num = gVar.f43488j) != null && gVar.f43482d.platformViewOfNode(num.intValue()) == hVar.b0(fVar6.f43461i)) {
                    gVar.h(gVar.f43488j.intValue(), C.DEFAULT_BUFFER_SEGMENT_SIZE);
                    gVar.f43488j = null;
                }
                int i23 = fVar6.f43461i;
                if (i23 != -1 && (viewB0 = hVar.b0(i23)) != null) {
                    viewB0.setImportantForAccessibility(4);
                }
                f fVar7 = gVar.f43487i;
                if (fVar7 == fVar6) {
                    gVar.h(fVar7.f43452b, C.DEFAULT_BUFFER_SEGMENT_SIZE);
                    gVar.f43487i = null;
                }
                if (gVar.f43491n == fVar6) {
                    gVar.f43491n = null;
                }
                if (gVar.f43493p == fVar6) {
                    gVar.f43493p = null;
                }
                it3.remove();
            }
        }
        int i24 = com.ironsource.mediationsdk.metadata.a.f29616n;
        AccessibilityEvent accessibilityEventE = gVar.e(0, com.ironsource.mediationsdk.metadata.a.f29616n);
        accessibilityEventE.setContentChangeTypes(1);
        gVar.i(accessibilityEventE);
        Iterator it4 = arrayList2.iterator();
        while (it4.hasNext()) {
            f fVar8 = (f) it4.next();
            if (!Float.isNaN(fVar8.l) && !Float.isNaN(fVar8.J) && fVar8.J != fVar8.l) {
                AccessibilityEvent accessibilityEventE2 = gVar.e(fVar8.f43452b, 4096);
                float f12 = fVar8.l;
                float f13 = fVar8.f43464m;
                if (Float.isInfinite(f13)) {
                    if (f12 > 70000.0f) {
                        f12 = 70000.0f;
                    }
                    f13 = 100000.0f;
                }
                if (Float.isInfinite(fVar8.f43465n)) {
                    f10 = f13 + 100000.0f;
                    if (f12 < -70000.0f) {
                        f12 = -70000.0f;
                    }
                    f11 = f12 + 100000.0f;
                } else {
                    float f14 = fVar8.f43465n;
                    f10 = f13 - f14;
                    f11 = f12 - f14;
                }
                int i25 = fVar8.G;
                if ((i25 & 16) != 0 || (i25 & 32) != 0) {
                    accessibilityEventE2.setScrollY((int) f11);
                    accessibilityEventE2.setMaxScrollY((int) f10);
                } else if ((i25 & 4) != 0 || (i25 & 8) != 0) {
                    accessibilityEventE2.setScrollX((int) f11);
                    accessibilityEventE2.setMaxScrollX((int) f10);
                }
                int i26 = fVar8.f43462j;
                if (i26 > 0) {
                    accessibilityEventE2.setItemCount(i26);
                    accessibilityEventE2.setFromIndex(fVar8.f43463k);
                    Iterator it5 = fVar8.U.iterator();
                    int i27 = 0;
                    while (it5.hasNext()) {
                        if (!((f) it5.next()).g(14)) {
                            i27++;
                        }
                    }
                    accessibilityEventE2.setToIndex((fVar8.f43463k + i27) - 1);
                }
                gVar.i(accessibilityEventE2);
            }
            if (fVar8.g(16) && (((str = fVar8.f43467p) != null || fVar8.L != null) && (str == null || !str.equals(fVar8.L)))) {
                AccessibilityEvent accessibilityEventE3 = gVar.e(fVar8.f43452b, i24);
                accessibilityEventE3.setContentChangeTypes(1);
                gVar.i(accessibilityEventE3);
            }
            f fVar9 = gVar.f43487i;
            if (fVar9 == null || fVar9.f43452b != fVar8.f43452b) {
                it = it4;
            } else {
                it = it4;
                if ((((long) u.c(3)) & fVar8.F) == 0 && fVar8.g(3)) {
                    AccessibilityEvent accessibilityEventE4 = gVar.e(fVar8.f43452b, i10);
                    accessibilityEventE4.getText().add(fVar8.f43467p);
                    gVar.i(accessibilityEventE4);
                }
            }
            f fVar10 = gVar.f43491n;
            if (fVar10 != null && (i11 = fVar10.f43452b) == (i12 = fVar8.f43452b) && ((fVar2 = gVar.f43492o) == null || fVar2.f43452b != i11)) {
                gVar.f43492o = fVar10;
                gVar.i(gVar.e(i12, 8));
            } else if (fVar10 == null) {
                gVar.f43492o = null;
            }
            f fVar11 = gVar.f43491n;
            if (fVar11 != null && fVar11.f43452b == fVar8.f43452b && (fVar8.F & ((long) u.c(5))) != 0 && fVar8.g(5) && ((fVar = gVar.f43487i) == null || fVar.f43452b == gVar.f43491n.f43452b)) {
                String str2 = fVar8.K;
                if (str2 == null) {
                    str2 = "";
                }
                String str3 = fVar8.f43469r;
                String str4 = str3 != null ? str3 : "";
                AccessibilityEvent accessibilityEventE5 = gVar.e(fVar8.f43452b, 16);
                accessibilityEventE5.setBeforeText(str2);
                accessibilityEventE5.getText().add(str4);
                int i28 = 0;
                while (i28 < str2.length() && i28 < str4.length() && str2.charAt(i28) == str4.charAt(i28)) {
                    i28++;
                }
                if (i28 < str2.length() || i28 < str4.length()) {
                    accessibilityEventE5.setFromIndex(i28);
                    int length = str2.length() - 1;
                    int length2 = str4.length() - 1;
                    while (length >= i28 && length2 >= i28 && str2.charAt(length) == str4.charAt(length2)) {
                        length--;
                        length2--;
                    }
                    accessibilityEventE5.setRemovedCount((length - i28) + 1);
                    accessibilityEventE5.setAddedCount((length2 - i28) + 1);
                } else {
                    accessibilityEventE5 = null;
                }
                if (accessibilityEventE5 != null) {
                    gVar.i(accessibilityEventE5);
                }
                if (fVar8.H != fVar8.f43459g || fVar8.I != fVar8.f43460h) {
                    AccessibilityEvent accessibilityEventE6 = gVar.e(fVar8.f43452b, Segment.SIZE);
                    accessibilityEventE6.getText().add(str4);
                    accessibilityEventE6.setFromIndex(fVar8.f43459g);
                    accessibilityEventE6.setToIndex(fVar8.f43460h);
                    accessibilityEventE6.setItemCount(str4.length());
                    gVar.i(accessibilityEventE6);
                }
            }
            it4 = it;
            i24 = com.ironsource.mediationsdk.metadata.a.f29616n;
            i10 = 4;
        }
    }
}
