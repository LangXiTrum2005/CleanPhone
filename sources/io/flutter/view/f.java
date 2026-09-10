package io.flutter.view;

import android.graphics.Rect;
import android.opengl.Matrix;
import android.text.SpannableString;
import android.text.TextUtils;
import com.unity3d.services.UnityAdsConstants;
import d5.u;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class f {
    public String A;
    public String B;
    public int C;
    public long F;
    public int G;
    public int H;
    public int I;
    public float J;
    public String K;
    public String L;
    public float M;
    public float N;
    public float O;
    public float P;
    public float[] Q;
    public float[] R;
    public f S;
    public ArrayList V;
    public e W;
    public e X;
    public float[] Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f43450a;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public float[] f43453b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f43454c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public Rect f43455c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f43456d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f43457e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f43458f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f43459g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f43460h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f43461i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f43462j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f43463k;
    public float l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f43464m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f43465n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f43466o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f43467p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ArrayList f43468q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public String f43469r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public List f43470s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public String f43471t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public ArrayList f43472u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public String f43473v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public ArrayList f43474w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f43475x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public ArrayList f43476y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public String f43477z;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f43452b = -1;
    public int D = -1;
    public boolean E = false;
    public final ArrayList T = new ArrayList();
    public final ArrayList U = new ArrayList();
    public boolean Y = true;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public boolean f43451a0 = true;

    public f(g gVar) {
        this.f43450a = gVar;
    }

    public static boolean a(f fVar, d dVar) {
        return (fVar.f43456d & dVar.f43444a) != 0;
    }

    public static CharSequence b(f fVar) {
        k5.g gVar = new k5.g();
        gVar.f44325a = fVar.f43469r;
        gVar.f44326b = fVar.f43470s;
        gVar.f44327c = fVar.d();
        SpannableString spannableStringC = gVar.c();
        k5.g gVar2 = new k5.g();
        gVar2.f44325a = fVar.f43467p;
        gVar2.f44326b = fVar.f43468q;
        gVar2.f44328d = fVar.A;
        gVar2.f44327c = fVar.d();
        SpannableString spannableStringC2 = gVar2.c();
        k5.g gVar3 = new k5.g();
        gVar3.f44325a = fVar.f43475x;
        gVar3.f44326b = fVar.f43476y;
        gVar3.f44327c = fVar.d();
        CharSequence[] charSequenceArr = {spannableStringC, spannableStringC2, gVar3.c()};
        CharSequence charSequenceConcat = null;
        for (int i10 = 0; i10 < 3; i10++) {
            CharSequence charSequence = charSequenceArr[i10];
            if (charSequence != null && charSequence.length() > 0) {
                charSequenceConcat = (charSequenceConcat == null || charSequenceConcat.length() == 0) ? charSequence : TextUtils.concat(charSequenceConcat, ", ", charSequence);
            }
        }
        return charSequenceConcat;
    }

    public static ArrayList f(ByteBuffer byteBuffer, ByteBuffer[] byteBufferArr) {
        int i10 = byteBuffer.getInt();
        if (i10 == -1) {
            return null;
        }
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = byteBuffer.getInt();
            int i13 = byteBuffer.getInt();
            int i14 = v0.i.d(2)[byteBuffer.getInt()];
            int iC = v0.i.c(i14);
            if (iC == 0) {
                byteBuffer.getInt();
                i iVar = new i();
                iVar.f43503a = i12;
                iVar.f43504b = i13;
                iVar.f43505c = i14;
                arrayList.add(iVar);
            } else if (iC == 1) {
                ByteBuffer byteBuffer2 = byteBufferArr[byteBuffer.getInt()];
                h hVar = new h();
                hVar.f43503a = i12;
                hVar.f43504b = i13;
                hVar.f43505c = i14;
                hVar.f43502d = StandardCharsets.UTF_8.decode(byteBuffer2).toString();
                arrayList.add(hVar);
            }
        }
        return arrayList;
    }

    public static void j(float[] fArr, float[] fArr2, float[] fArr3) {
        Matrix.multiplyMV(fArr, 0, fArr2, 0, fArr3, 0);
        float f10 = fArr[3];
        fArr[0] = fArr[0] / f10;
        fArr[1] = fArr[1] / f10;
        fArr[2] = fArr[2] / f10;
        fArr[3] = 0.0f;
    }

    public final void c(ArrayList arrayList) {
        if (g(12)) {
            arrayList.add(this);
        }
        Iterator it = this.T.iterator();
        while (it.hasNext()) {
            ((f) it.next()).c(arrayList);
        }
    }

    public final String d() {
        String str = this.B;
        return (str == null || str.isEmpty()) ? this.f43450a.f43490m : this.B;
    }

    public final String e() {
        String str;
        if (g(13) && (str = this.f43467p) != null && !str.isEmpty()) {
            return this.f43467p;
        }
        Iterator it = this.T.iterator();
        while (it.hasNext()) {
            String strE = ((f) it.next()).e();
            if (strE != null && !strE.isEmpty()) {
                return strE;
            }
        }
        return null;
    }

    public final boolean g(int i10) {
        return (((long) u.c(i10)) & this.f43454c) != 0;
    }

    public final f h(float[] fArr, boolean z10) {
        float f10 = fArr[3];
        boolean z11 = false;
        float f11 = fArr[0] / f10;
        float f12 = fArr[1] / f10;
        if (f11 < this.M || f11 >= this.O || f12 < this.N || f12 >= this.P) {
            return null;
        }
        float[] fArr2 = new float[4];
        for (f fVar : this.U) {
            if (!fVar.g(14)) {
                if (fVar.Y) {
                    fVar.Y = false;
                    if (fVar.Z == null) {
                        fVar.Z = new float[16];
                    }
                    if (!Matrix.invertM(fVar.Z, 0, fVar.R, 0)) {
                        Arrays.fill(fVar.Z, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    }
                }
                float[] fArr3 = fArr;
                Matrix.multiplyMV(fArr2, 0, fVar.Z, 0, fArr3, 0);
                f fVarH = fVar.h(fArr2, z10);
                if (fVarH != null) {
                    return fVarH;
                }
                fArr = fArr3;
            }
        }
        if (z10 && this.f43461i != -1) {
            z11 = true;
        }
        if (i() || z11) {
            return this;
        }
        return null;
    }

    public final boolean i() {
        if (g(12)) {
            return false;
        }
        if (g(22)) {
            return true;
        }
        if (g(32)) {
            return false;
        }
        int i10 = this.f43456d;
        int i11 = g.f43478y;
        if ((i10 & (-61)) != 0 || (this.f43454c & ((long) 10682871)) != 0) {
            return true;
        }
        String str = this.f43467p;
        if (str != null && !str.isEmpty()) {
            return true;
        }
        String str2 = this.f43469r;
        if (str2 != null && !str2.isEmpty()) {
            return true;
        }
        String str3 = this.f43475x;
        return (str3 == null || str3.isEmpty()) ? false : true;
    }

    public final void k(float[] fArr, HashSet hashSet, boolean z10) {
        hashSet.add(this);
        if (this.f43451a0) {
            z10 = true;
        }
        if (z10) {
            if (this.f43453b0 == null) {
                this.f43453b0 = new float[16];
            }
            if (this.Q == null) {
                this.Q = new float[16];
            }
            Matrix.multiplyMM(this.f43453b0, 0, fArr, 0, this.Q, 0);
            float[] fArr2 = {this.M, this.N, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f};
            float[] fArr3 = new float[4];
            float[] fArr4 = new float[4];
            float[] fArr5 = new float[4];
            float[] fArr6 = new float[4];
            j(fArr3, this.f43453b0, fArr2);
            fArr2[0] = this.O;
            fArr2[1] = this.N;
            j(fArr4, this.f43453b0, fArr2);
            fArr2[0] = this.O;
            fArr2[1] = this.P;
            j(fArr5, this.f43453b0, fArr2);
            fArr2[0] = this.M;
            fArr2[1] = this.P;
            j(fArr6, this.f43453b0, fArr2);
            if (this.f43455c0 == null) {
                this.f43455c0 = new Rect();
            }
            this.f43455c0.set(Math.round(Math.min(fArr3[0], Math.min(fArr4[0], Math.min(fArr5[0], fArr6[0])))), Math.round(Math.min(fArr3[1], Math.min(fArr4[1], Math.min(fArr5[1], fArr6[1])))), Math.round(Math.max(fArr3[0], Math.max(fArr4[0], Math.max(fArr5[0], fArr6[0])))), Math.round(Math.max(fArr3[1], Math.max(fArr4[1], Math.max(fArr5[1], fArr6[1])))));
            this.f43451a0 = false;
        }
        int i10 = -1;
        for (f fVar : this.T) {
            fVar.D = i10;
            i10 = fVar.f43452b;
            fVar.k(this.f43453b0, hashSet, z10);
        }
    }
}
