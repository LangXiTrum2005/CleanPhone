package b2;

import android.R;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Message;
import android.util.Base64OutputStream;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import com.applovin.impl.ca;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.dc1;
import com.google.android.gms.internal.ads.du0;
import com.google.android.gms.internal.ads.dv;
import com.google.android.gms.internal.ads.e3;
import com.google.android.gms.internal.ads.h2;
import com.google.android.gms.internal.ads.hz;
import com.google.android.gms.internal.ads.k3;
import com.google.android.gms.internal.ads.kx0;
import com.google.android.gms.internal.ads.md0;
import com.google.android.gms.internal.ads.np0;
import com.google.android.gms.internal.ads.od;
import com.google.android.gms.internal.ads.oi;
import com.google.android.gms.internal.ads.pc;
import com.google.android.gms.internal.ads.pi;
import com.google.android.gms.internal.ads.ps1;
import com.google.android.gms.internal.ads.q01;
import com.google.android.gms.internal.ads.ru0;
import com.google.android.gms.internal.ads.sd;
import com.google.android.gms.internal.ads.tb;
import com.google.android.gms.internal.ads.ul0;
import com.google.android.gms.internal.ads.uu0;
import com.google.android.gms.internal.ads.wh0;
import com.google.android.gms.internal.ads.yd1;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.common.util.concurrent.ListenableFuture;
import f2.b1;
import f2.c1;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import java.util.PriorityQueue;
import m0.s1;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class w implements c1, e3, yd1, Continuation, ta.y, n2.x, l0.b, s6.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5409a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f5410b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f5411c;

    public /* synthetic */ w(int i10, int i11, Object obj) {
        this.f5409a = i11;
        this.f5411c = obj;
        this.f5410b = i10;
    }

    @Override // s6.a
    public g6.a0 a(g6.a0 a0Var, e6.i iVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ((Bitmap) a0Var.get()).compress((Bitmap.CompressFormat) this.f5411c, this.f5410b, byteArrayOutputStream);
        a0Var.b();
        return new n6.y(byteArrayOutputStream.toByteArray());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1, types: [android.widget.ListAdapter] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    public k.f b() {
        k.c cVar = (k.c) this.f5411c;
        k.f fVar = new k.f(cVar.f44046a, this.f5410b);
        View view = cVar.f44050e;
        k.e eVar = fVar.f44094g;
        if (view != null) {
            eVar.f44078r = view;
        } else {
            CharSequence charSequence = cVar.f44049d;
            if (charSequence != null) {
                eVar.f44065d = charSequence;
                TextView textView = eVar.f44076p;
                if (textView != null) {
                    textView.setText(charSequence);
                }
            }
            Drawable drawable = cVar.f44048c;
            if (drawable != null) {
                eVar.f44074n = drawable;
                ImageView imageView = eVar.f44075o;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    eVar.f44075o.setImageDrawable(drawable);
                }
            }
        }
        CharSequence charSequence2 = cVar.f44051f;
        if (charSequence2 != null) {
            t.s sVar = cVar.f44052g;
            Message messageObtainMessage = sVar != null ? eVar.f44086z.obtainMessage(-2, sVar) : null;
            eVar.f44071j = charSequence2;
            eVar.f44072k = messageObtainMessage;
        }
        if (cVar.f44054i != null) {
            AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) cVar.f44047b.inflate(eVar.f44082v, (ViewGroup) null);
            int i10 = cVar.l ? eVar.f44083w : eVar.f44084x;
            Object obj = cVar.f44054i;
            ?? dVar = obj;
            if (obj == null) {
                dVar = new k.d(cVar.f44046a, i10, R.id.text1, null);
            }
            eVar.f44079s = dVar;
            eVar.f44080t = cVar.f44057m;
            if (cVar.f44055j != null) {
                alertController$RecycleListView.setOnItemClickListener(new k.b(cVar, eVar));
            }
            if (cVar.l) {
                alertController$RecycleListView.setChoiceMode(1);
            }
            eVar.f44066e = alertController$RecycleListView;
        }
        View view2 = cVar.f44056k;
        if (view2 != null) {
            eVar.f44067f = view2;
            eVar.f44068g = false;
        }
        fVar.setCancelable(true);
        fVar.setCanceledOnTouchOutside(true);
        fVar.setOnCancelListener(null);
        fVar.setOnDismissListener(null);
        o.n nVar = cVar.f44053h;
        if (nVar != null) {
            fVar.setOnKeyListener(nVar);
        }
        return fVar;
    }

    public void c(int i10, int i11) {
        int i12 = i11 + i10;
        char[] cArr = (char[]) this.f5411c;
        if (cArr.length <= i12) {
            int i13 = i10 * 2;
            if (i12 < i13) {
                i12 = i13;
            }
            char[] cArrCopyOf = Arrays.copyOf(cArr, i12);
            kotlin.jvm.internal.n.e(cArrCopyOf, "copyOf(...)");
            this.f5411c = cArrCopyOf;
        }
    }

    @Override // ta.y
    public /* synthetic */ ListenableFuture call() {
        return ((com.google.android.gms.internal.consent_sdk.x) this.f5411c).J(this.f5410b);
    }

    public synchronized void d() {
        this.f5410b++;
    }

    @Override // l0.b
    public boolean e(Object instance) {
        boolean z10;
        Object[] objArr = (Object[]) this.f5411c;
        kotlin.jvm.internal.n.f(instance, "instance");
        int i10 = this.f5410b;
        int i11 = 0;
        while (true) {
            if (i11 >= i10) {
                z10 = false;
                break;
            }
            if (objArr[i11] == instance) {
                z10 = true;
                break;
            }
            i11++;
        }
        if (z10) {
            throw new IllegalStateException("Already in the pool!");
        }
        int i12 = this.f5410b;
        if (i12 >= objArr.length) {
            return false;
        }
        objArr[i12] = instance;
        this.f5410b = i12 + 1;
        return true;
    }

    public long f(n2.h hVar) {
        l1.q qVar = (l1.q) this.f5411c;
        int i10 = 0;
        hVar.peekFully(qVar.f44813a, 0, 1, false);
        int i11 = qVar.f44813a[0] & 255;
        if (i11 == 0) {
            return Long.MIN_VALUE;
        }
        int i12 = 128;
        int i13 = 0;
        while ((i11 & i12) == 0) {
            i12 >>= 1;
            i13++;
        }
        int i14 = i11 & (~i12);
        hVar.peekFully(qVar.f44813a, 1, i13, false);
        while (i10 < i13) {
            i10++;
            i14 = (qVar.f44813a[i10] & 255) + (i14 << 8);
        }
        this.f5410b = i13 + 1 + this.f5410b;
        return i14;
    }

    @Override // l0.b
    public Object g() {
        Object[] objArr = (Object[]) this.f5411c;
        int i10 = this.f5410b;
        if (i10 <= 0) {
            return null;
        }
        int i11 = i10 - 1;
        Object obj = objArr[i11];
        kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool");
        objArr[i11] = null;
        this.f5410b--;
        return obj;
    }

    @Override // f2.c1
    public int h(s1 s1Var, o1.d dVar, int i10) {
        x xVar = (x) this.f5411c;
        int i11 = this.f5410b;
        if (xVar.f5427q) {
            return -3;
        }
        v vVar = (v) xVar.f5416e.get(i11);
        return vVar.f5405c.C(s1Var, dVar, i10, vVar.f5406d);
    }

    public void i() {
        tn.b bVar = tn.b.f51592c;
        char[] array = (char[]) this.f5411c;
        bVar.getClass();
        kotlin.jvm.internal.n.f(array, "array");
        synchronized (bVar) {
            int i10 = bVar.f4130a;
            if (array.length + i10 < tn.a.f51591a) {
                bVar.f4130a = i10 + array.length;
                ((xj.j) bVar.f4131b).addLast(array);
            }
        }
    }

    @Override // f2.c1
    public boolean isReady() {
        x xVar = (x) this.f5411c;
        int i10 = this.f5410b;
        if (xVar.f5427q) {
            return false;
        }
        v vVar = (v) xVar.f5416e.get(i10);
        return vVar.f5405c.x(vVar.f5406d);
    }

    public void j(String text) {
        kotlin.jvm.internal.n.f(text, "text");
        int length = text.length();
        if (length == 0) {
            return;
        }
        c(this.f5410b, length);
        text.getChars(0, text.length(), (char[]) this.f5411c, this.f5410b);
        this.f5410b += length;
    }

    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v4 */
    public String k(ArrayList arrayList) {
        StringBuilder sb2 = new StringBuilder();
        int size = arrayList.size();
        ?? r3 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            sb2.append(((String) arrayList.get(i10)).toLowerCase(Locale.US));
            sb2.append('\n');
        }
        String[] strArrSplit = sb2.toString().split("\n");
        if (strArrSplit.length == 0) {
            return "";
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(4096);
        Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream, 10);
        int i11 = this.f5410b;
        PriorityQueue priorityQueue = new PriorityQueue(i11, new com.google.android.gms.internal.ads.b(15));
        int i12 = 0;
        while (i12 < strArrSplit.length) {
            String[] strArrG = ps1.G(strArrSplit[i12], r3);
            if (strArrG.length != 0) {
                int length = strArrG.length;
                if (length < 6) {
                    dv.r(i11, dv.E(length, strArrG), dv.y(strArrG, r3, length), length, priorityQueue);
                } else {
                    long jE = dv.E(6, strArrG);
                    dv.r(i11, jE, dv.y(strArrG, r3, 6), 6, priorityQueue);
                    int i13 = 1;
                    while (true) {
                        int length2 = strArrG.length;
                        if (i13 < length2 - 5) {
                            int iB = ps1.b(strArrG[i13 - 1]);
                            int iB2 = ps1.b(strArrG[i13 + 5]);
                            int i14 = i13;
                            String[] strArr = strArrSplit;
                            String strY = dv.y(strArrG, i14, 6);
                            jE = (((((long) iB2) + 2147483647L) % 1073807359) + (((((jE + 1073807359) - ((((((long) iB) + 2147483647L) % 1073807359) * dv.A(5, 16785407L)) % 1073807359)) % 1073807359) * 16785407) % 1073807359)) % 1073807359;
                            dv.r(i11, jE, strY, length2, priorityQueue);
                            i13 = i14 + 1;
                            strArrSplit = strArr;
                            byteArrayOutputStream = byteArrayOutputStream;
                        }
                    }
                }
            }
            i12++;
            strArrSplit = strArrSplit;
            byteArrayOutputStream = byteArrayOutputStream;
            r3 = 0;
        }
        ByteArrayOutputStream byteArrayOutputStream2 = byteArrayOutputStream;
        Iterator it = priorityQueue.iterator();
        while (it.hasNext()) {
            try {
                base64OutputStream.write(((oi) this.f5411c).X0(((pi) it.next()).f18663b));
            } catch (IOException e10) {
                int i15 = zze.zza;
                zzo.zzg("Error while writing hash to byteStream", e10);
            }
        }
        try {
            base64OutputStream.close();
        } catch (IOException e11) {
            int i16 = zze.zza;
            zzo.zzg("HashManager: Unable to convert to Base64.", e11);
        }
        try {
            byteArrayOutputStream2.close();
            return byteArrayOutputStream2.toString();
        } catch (IOException e12) {
            int i17 = zze.zza;
            zzo.zzg("HashManager: Unable to convert to Base64.", e12);
            return "";
        }
    }

    public void l(int i10, byte[] bArr) {
        int i11 = 1777080124;
        int i12 = 1777080124;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        int i24 = 0;
        char c4 = 0;
        int i25 = 0;
        char c5 = 0;
        char c10 = 0;
        while (true) {
            if (i12 == 719824015) {
                int i26 = (-235787554) + i12;
                i12 += 799411447;
                if (i13 == i14) {
                    i12 = i26;
                }
            } else if (i12 == 1519235462) {
                int[] iArr = (int[]) this.f5411c;
                i15 += (((i16 << i17) ^ (i16 >>> i18)) + i16) ^ (i13 + iArr[i13 & i19]);
                i13 += i20;
                i16 += (iArr[(i13 >>> i21) & i19] + i13) ^ (((i15 << i17) ^ (i15 >>> i18)) + i15);
                i12 -= 799411447;
            } else {
                if (i12 != i11) {
                    bArr[0] = (byte) (i15 >> i22);
                    bArr[1] = (byte) ((((i15 >> i23) & i24) << i22) >> i22);
                    bArr[c4] = (byte) ((((i15 >> i25) & i24) << i22) >> i22);
                    bArr[i19] = (byte) (((i15 & i24) << i22) >> i22);
                    bArr[i17] = (byte) (i16 >> i22);
                    bArr[i18] = (byte) ((((i16 >> i23) & i24) << i22) >> i22);
                    bArr[c5] = (byte) ((((i16 >> i25) & i24) << i22) >> i22);
                    bArr[c10] = (byte) (((i16 & i24) << i22) >> i22);
                    return;
                }
                i15 = this.f5410b;
                i12 -= 1057256109;
                i19 = 3;
                i24 = 255;
                c10 = 7;
                c5 = 6;
                c4 = 2;
                i22 = 24;
                i21 = 11;
                i20 = 1340169305;
                i18 = 5;
                i17 = 4;
                i14 = -64255200;
                i23 = 16;
                i25 = 8;
                i16 = i10;
                i13 = 0;
            }
            i11 = 1777080124;
        }
    }

    @Override // f2.c1
    public void maybeThrowError() throws z {
        z zVar = ((x) this.f5411c).l;
        if (zVar != null) {
            throw zVar;
        }
    }

    public long n(h2 h2Var) {
        int i10;
        np0 np0Var = (np0) this.f5411c;
        int i11 = 0;
        h2Var.m(np0Var.f17880a, 0, 1, false);
        int i12 = np0Var.f17880a[0] & 255;
        if (i12 == 0) {
            return Long.MIN_VALUE;
        }
        int i13 = 128;
        int i14 = 0;
        while (true) {
            i10 = i14 + 1;
            if ((i12 & i13) != 0) {
                break;
            }
            i13 >>= 1;
            i14 = i10;
        }
        int i15 = i12 & (~i13);
        h2Var.m(np0Var.f17880a, 1, i14, false);
        while (i11 < i14) {
            i11++;
            i15 = (np0Var.f17880a[i11] & 255) + (i15 << 8);
        }
        this.f5410b += i10;
        return i15;
    }

    @Override // f2.c1
    public int skipData(long j10) {
        x xVar = (x) this.f5411c;
        int i10 = this.f5410b;
        if (xVar.f5427q) {
            return -3;
        }
        v vVar = (v) xVar.f5416e.get(i10);
        b1 b1Var = vVar.f5405c;
        int iV = b1Var.v(j10, vVar.f5406d);
        b1Var.H(iV);
        return iV;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        if (!task.isSuccessful()) {
            return Boolean.FALSE;
        }
        int i10 = this.f5410b;
        od odVar = (od) this.f5411c;
        q01 q01Var = (q01) task.getResult();
        byte[] bArrB = ((sd) odVar.e()).b();
        q01Var.getClass();
        k3 k3Var = new k3(q01Var, bArrB);
        k3Var.f16294b = i10;
        k3Var.D();
        return Boolean.TRUE;
    }

    public String toString() {
        switch (this.f5409a) {
            case 2:
                dc1 dc1Var = (dc1) this.f5411c;
                ArrayList arrayList = new ArrayList(dc1Var.f13495b);
                for (int i10 = 0; i10 < dc1Var.f13495b; i10++) {
                    arrayList.add(uu0.a(dc1Var.a(i10)));
                }
                String strA = uu0.a(this.f5410b);
                String string = arrayList.toString();
                StringBuilder sb2 = new StringBuilder(ca.i(strA.length() + 37, 1, string));
                sb2.append("UnsupportedBrands{major=");
                sb2.append(strA);
                sb2.append(", compatible=");
                sb2.append(string);
                sb2.append("}");
                return sb2.toString();
            case 13:
                sa.a aVar = (sa.a) this.f5411c;
                ArrayList arrayList2 = new ArrayList(aVar.f50222b);
                int i11 = 0;
                while (true) {
                    int i12 = aVar.f50222b;
                    if (i11 >= i12) {
                        return "UnsupportedBrands{major=" + l1.y.X(this.f5410b) + ", compatible=" + arrayList2 + "}";
                    }
                    go.k.m(i11, i12);
                    arrayList2.add(l1.y.X(aVar.f50221a[i11]));
                    i11++;
                }
                break;
            case 21:
                return new String((char[]) this.f5411c, 0, this.f5410b);
            default:
                return super.toString();
        }
    }

    @Override // com.google.android.gms.internal.ads.yd1
    public void zza(Throwable th2) {
        switch (this.f5409a) {
            case 5:
                break;
            default:
                zzt.zzh().d("BufferingUrlPinger.attributionReportingManager", th2);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.yd1
    /* JADX INFO: renamed from: zzb */
    public void mo164zzb(Object obj) {
        switch (this.f5409a) {
            case 5:
                String strB = ca.b(this.f5410b);
                ((p9.b) zzt.zzk()).getClass();
                ((wh0) ((hz) this.f5411c).f15436e).c(System.currentTimeMillis(), strB);
                break;
            default:
                ru0 ru0Var = (ru0) this.f5411c;
                String str = (String) obj;
                int i10 = this.f5410b;
                du0 du0Var = ru0Var.f19668a;
                if (!du0Var.f13691i0) {
                    ru0Var.f19670c.b(str, du0Var.f13718x0, ru0Var.f19672e, null);
                } else {
                    kx0 kx0Var = ru0Var.f19671d;
                    String str2 = ru0Var.f19669b.f14546b;
                    kx0Var.getClass();
                    ((p9.b) zzt.zzk()).getClass();
                    tb tbVar = new tb(str2, i10, str, System.currentTimeMillis());
                    ul0 ul0Var = kx0Var.f16556a;
                    ul0Var.getClass();
                    ul0Var.a(new md0(23, ul0Var, tbVar));
                }
                break;
        }
    }

    public /* synthetic */ w(int i10, int i11, Object[] objArr) {
        this.f5409a = i11;
        this.f5410b = i10;
        this.f5411c = objArr;
    }

    public w(byte b10, int i10) {
        this.f5409a = i10;
        switch (i10) {
            case 10:
                this.f5410b = 0;
                break;
            case 11:
                this.f5411c = new l1.q(8);
                break;
            case 19:
                this.f5411c = Bitmap.CompressFormat.JPEG;
                this.f5410b = 100;
                break;
            case 21:
                break;
            default:
                this.f5411c = new np0(8);
                break;
        }
    }

    public w(int i10, int i11) {
        this.f5409a = i11;
        switch (i11) {
            case 16:
                if (i10 > 0) {
                    this.f5411c = new Object[i10];
                    return;
                }
                throw new IllegalArgumentException("The max pool size must be > 0");
            default:
                this.f5411c = new oi(2);
                this.f5410b = i10;
                return;
        }
    }

    public w(int i10, int i11, int[] iArr) {
        sa.a aVar;
        dc1 dc1Var;
        this.f5409a = i11;
        switch (i11) {
            case 3:
                int length = iArr.length;
                if (length == 4) {
                    this.f5410b = i10;
                    this.f5411c = iArr;
                    return;
                } else {
                    StringBuilder sb2 = new StringBuilder(ca.e(length, 44));
                    sb2.append(pc.a("Ake3rgkWMjm+UlOd1Tg3PHccqBbIRJQk3bhyKj5k"));
                    sb2.append(length);
                    sb2.append(pc.a("a0CvvBEaN339T0zNlXk="));
                    throw new IllegalArgumentException(sb2.toString());
                }
            case 13:
                this.f5410b = i10;
                if (iArr != null) {
                    sa.a aVar2 = sa.a.f50220c;
                    aVar = iArr.length == 0 ? sa.a.f50220c : new sa.a(Arrays.copyOf(iArr, iArr.length));
                } else {
                    aVar = sa.a.f50220c;
                }
                this.f5411c = aVar;
                return;
            default:
                this.f5410b = i10;
                if (iArr != null) {
                    int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
                    dc1Var = new dc1(iArrCopyOf, iArrCopyOf.length);
                } else {
                    dc1Var = dc1.f13493c;
                }
                this.f5411c = dc1Var;
                return;
        }
    }

    private final void m(Throwable th2) {
    }

    public w(Context context) {
        this.f5409a = 15;
        int iE = k.f.e(context, 0);
        this.f5411c = new k.c(new ContextThemeWrapper(context, k.f.e(context, iE)));
        this.f5410b = iE;
    }
}
