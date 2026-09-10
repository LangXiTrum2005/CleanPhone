package d2;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.unity3d.services.UnityAdsConstants;
import f2.a0;
import g2.i;
import h3.p;
import i1.q0;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import k1.f;
import k1.g;
import k1.h;
import l1.u;
import n2.k;
import oa.j0;
import oa.q;
import v1.r;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements na.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38630a;

    public /* synthetic */ c(int i10) {
        this.f38630a = i10;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0329  */
    /* JADX WARN: Code duplicated, block: B:101:0x0330  */
    /* JADX WARN: Code duplicated, block: B:104:0x033a  */
    /* JADX WARN: Code duplicated, block: B:107:0x0348  */
    /* JADX WARN: Code duplicated, block: B:109:0x034f  */
    /* JADX WARN: Code duplicated, block: B:112:0x035b  */
    /* JADX WARN: Code duplicated, block: B:113:0x035e  */
    /* JADX WARN: Code duplicated, block: B:116:0x0368  */
    /* JADX WARN: Code duplicated, block: B:119:0x0376  */
    /* JADX WARN: Code duplicated, block: B:121:0x037d  */
    /* JADX WARN: Code duplicated, block: B:124:0x0387  */
    /* JADX WARN: Code duplicated, block: B:76:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:78:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:79:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:82:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:83:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:86:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:87:0x02ed  */
    /* JADX WARN: Code duplicated, block: B:90:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:91:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:94:0x0308  */
    /* JADX WARN: Code duplicated, block: B:96:0x0310  */
    /* JADX WARN: Code duplicated, block: B:97:0x031d  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r1v33, types: [android.text.Spannable, android.text.SpannableString] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    @Override // na.e
    public final Object apply(Object obj) {
        ?? r13;
        Bitmap bitmapDecodeByteArray;
        String str;
        float f10;
        int i10;
        String str2;
        int i11;
        String str3;
        float f11;
        String str4;
        int i12;
        String str5;
        float f12;
        int i13;
        String str6;
        float f13;
        String str7;
        int i14;
        boolean z10;
        String str8;
        float f14;
        String str9;
        String str10;
        int i15 = 2;
        boolean z11 = true;
        int i16 = 3;
        switch (this.f38630a) {
            case 0:
                return j0.B(Integer.valueOf(((i) obj).f41380a));
            case 1:
                k kVar = (k) obj;
                kVar.getClass();
                return kVar.getClass().getSimpleName();
            case 2:
                return j0.x(q.z(((a0) obj).getTrackGroups().f40387b, new c(i16)));
            case 3:
                return Integer.valueOf(((q0) obj).f42661c);
            case 4:
                return Long.valueOf(((k3.a) obj).f44269b);
            case 5:
                return Long.valueOf(((k3.a) obj).f44270c);
            case 6:
                return (p) obj;
            case 7:
                i1.q qVar = (i1.q) obj;
                return qVar.f42657a + ": " + qVar.f42658b;
            case 8:
                return Integer.valueOf(((k1.b) obj).f44241r);
            case 9:
                Bundle bundle = (Bundle) obj;
                ?? charSequence = bundle.getCharSequence(k1.b.f44217s);
                if (charSequence != 0) {
                    ArrayList<Bundle> parcelableArrayList = bundle.getParcelableArrayList(k1.b.f44218t);
                    if (parcelableArrayList != null) {
                        charSequence = SpannableString.valueOf(charSequence);
                        for (Bundle bundle2 : parcelableArrayList) {
                            int i17 = bundle2.getInt(k1.d.f44244a);
                            int i18 = bundle2.getInt(k1.d.f44245b);
                            int i19 = bundle2.getInt(k1.d.f44246c);
                            int i20 = bundle2.getInt(k1.d.f44247d, -1);
                            Bundle bundle3 = bundle2.getBundle(k1.d.f44248e);
                            if (i20 == 1) {
                                bundle3.getClass();
                                String string = bundle3.getString(f.f44249c);
                                string.getClass();
                                charSequence.setSpan(new f(string, bundle3.getInt(f.f44250d)), i17, i18, i19);
                            } else if (i20 == i15) {
                                bundle3.getClass();
                                charSequence.setSpan(new g(bundle3.getInt(g.f44253d), bundle3.getInt(g.f44254e), bundle3.getInt(g.f44255f)), i17, i18, i19);
                            } else if (i20 == 3) {
                                charSequence.setSpan(new k1.e(), i17, i18, i19);
                            } else if (i20 == 4) {
                                bundle3.getClass();
                                String string2 = bundle3.getString(h.f44259b);
                                string2.getClass();
                                charSequence.setSpan(new h(string2), i17, i18, i19);
                            }
                            i15 = 2;
                        }
                    }
                } else {
                    charSequence = 0;
                }
                Layout.Alignment alignment = (Layout.Alignment) bundle.getSerializable(k1.b.f44219u);
                Layout.Alignment alignment2 = alignment != null ? alignment : null;
                Layout.Alignment alignment3 = (Layout.Alignment) bundle.getSerializable(k1.b.f44220v);
                Layout.Alignment alignment4 = alignment3 != null ? alignment3 : null;
                Bitmap bitmap = (Bitmap) bundle.getParcelable(k1.b.f44221w);
                if (bitmap == null) {
                    byte[] byteArray = bundle.getByteArray(k1.b.f44222x);
                    if (byteArray != null) {
                        bitmapDecodeByteArray = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);
                    } else {
                        r13 = charSequence;
                        bitmapDecodeByteArray = null;
                    }
                    str = k1.b.f44223y;
                    if (bundle.containsKey(str)) {
                        str10 = k1.b.f44224z;
                        if (bundle.containsKey(str10)) {
                            f10 = bundle.getFloat(str);
                            i10 = bundle.getInt(str10);
                        } else {
                            f10 = -3.4028235E38f;
                            i10 = Integer.MIN_VALUE;
                        }
                    } else {
                        f10 = -3.4028235E38f;
                        i10 = Integer.MIN_VALUE;
                    }
                    str2 = k1.b.A;
                    if (bundle.containsKey(str2)) {
                        i11 = bundle.getInt(str2);
                    } else {
                        i11 = Integer.MIN_VALUE;
                    }
                    str3 = k1.b.B;
                    if (bundle.containsKey(str3)) {
                        f11 = bundle.getFloat(str3);
                    } else {
                        f11 = -3.4028235E38f;
                    }
                    str4 = k1.b.C;
                    if (bundle.containsKey(str4)) {
                        i12 = bundle.getInt(str4);
                    } else {
                        i12 = Integer.MIN_VALUE;
                    }
                    str5 = k1.b.E;
                    if (bundle.containsKey(str5)) {
                        str9 = k1.b.D;
                        if (bundle.containsKey(str9)) {
                            f12 = bundle.getFloat(str5);
                            i13 = bundle.getInt(str9);
                        } else {
                            f12 = -3.4028235E38f;
                            i13 = Integer.MIN_VALUE;
                        }
                    } else {
                        f12 = -3.4028235E38f;
                        i13 = Integer.MIN_VALUE;
                    }
                    str6 = k1.b.F;
                    if (bundle.containsKey(str6)) {
                        f13 = bundle.getFloat(str6);
                    } else {
                        f13 = -3.4028235E38f;
                    }
                    String str11 = k1.b.G;
                    float f15 = bundle.containsKey(str11) ? bundle.getFloat(str11) : -3.4028235E38f;
                    str7 = k1.b.H;
                    if (bundle.containsKey(str7)) {
                        i14 = bundle.getInt(str7);
                    } else {
                        i14 = -16777216;
                        z11 = false;
                    }
                    int i21 = i14;
                    if (bundle.getBoolean(k1.b.I, false)) {
                        z10 = z11;
                    } else {
                        z10 = false;
                    }
                    String str12 = k1.b.J;
                    int i22 = bundle.containsKey(str12) ? bundle.getInt(str12) : Integer.MIN_VALUE;
                    str8 = k1.b.K;
                    if (bundle.containsKey(str8)) {
                        f14 = bundle.getFloat(str8);
                    } else {
                        f14 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    }
                    float f16 = f14;
                    String str13 = k1.b.L;
                    return new k1.b(r13, alignment2, alignment4, bitmapDecodeByteArray, f10, i10, i11, f11, i12, i13, f12, f13, f15, z10, i21, i22, f16, bundle.containsKey(str13) ? bundle.getInt(str13) : 0);
                }
                bitmapDecodeByteArray = bitmap;
                r13 = 0;
                str = k1.b.f44223y;
                if (bundle.containsKey(str)) {
                    str10 = k1.b.f44224z;
                    if (bundle.containsKey(str10)) {
                        f10 = bundle.getFloat(str);
                        i10 = bundle.getInt(str10);
                    } else {
                        f10 = -3.4028235E38f;
                        i10 = Integer.MIN_VALUE;
                    }
                } else {
                    f10 = -3.4028235E38f;
                    i10 = Integer.MIN_VALUE;
                }
                str2 = k1.b.A;
                if (bundle.containsKey(str2)) {
                    i11 = bundle.getInt(str2);
                } else {
                    i11 = Integer.MIN_VALUE;
                }
                str3 = k1.b.B;
                if (bundle.containsKey(str3)) {
                    f11 = bundle.getFloat(str3);
                } else {
                    f11 = -3.4028235E38f;
                }
                str4 = k1.b.C;
                if (bundle.containsKey(str4)) {
                    i12 = bundle.getInt(str4);
                } else {
                    i12 = Integer.MIN_VALUE;
                }
                str5 = k1.b.E;
                if (bundle.containsKey(str5)) {
                    str9 = k1.b.D;
                    if (bundle.containsKey(str9)) {
                        f12 = bundle.getFloat(str5);
                        i13 = bundle.getInt(str9);
                    } else {
                        f12 = -3.4028235E38f;
                        i13 = Integer.MIN_VALUE;
                    }
                } else {
                    f12 = -3.4028235E38f;
                    i13 = Integer.MIN_VALUE;
                }
                str6 = k1.b.F;
                if (bundle.containsKey(str6)) {
                    f13 = bundle.getFloat(str6);
                } else {
                    f13 = -3.4028235E38f;
                }
                String str14 = k1.b.G;
                float f17 = bundle.containsKey(str14) ? bundle.getFloat(str14) : -3.4028235E38f;
                str7 = k1.b.H;
                if (bundle.containsKey(str7)) {
                    i14 = bundle.getInt(str7);
                } else {
                    i14 = -16777216;
                    z11 = false;
                }
                int i23 = i14;
                if (bundle.getBoolean(k1.b.I, false)) {
                    z10 = false;
                } else {
                    z10 = z11;
                }
                String str15 = k1.b.J;
                int i24 = bundle.containsKey(str15) ? bundle.getInt(str15) : Integer.MIN_VALUE;
                str8 = k1.b.K;
                if (bundle.containsKey(str8)) {
                    f14 = bundle.getFloat(str8);
                } else {
                    f14 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                }
                float f18 = f14;
                String str16 = k1.b.L;
                return new k1.b(r13, alignment2, alignment4, bitmapDecodeByteArray, f10, i10, i11, f11, i12, i13, f12, f13, f17, z10, i23, i24, f18, bundle.containsKey(str16) ? bundle.getInt(str16) : 0);
            case 10:
                k1.b bVar = (k1.b) obj;
                Bitmap bitmap2 = bVar.f44228d;
                Bundle bundle4 = new Bundle();
                CharSequence charSequence2 = bVar.f44225a;
                if (charSequence2 != null) {
                    bundle4.putCharSequence(k1.b.f44217s, charSequence2);
                    if (charSequence2 instanceof Spanned) {
                        Spanned spanned = (Spanned) charSequence2;
                        String str17 = k1.d.f44244a;
                        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                        for (f fVar : (f[]) spanned.getSpans(0, spanned.length(), f.class)) {
                            fVar.getClass();
                            Bundle bundle5 = new Bundle();
                            bundle5.putString(f.f44249c, fVar.f44251a);
                            bundle5.putInt(f.f44250d, fVar.f44252b);
                            arrayList.add(k1.d.a(spanned, fVar, 1, bundle5));
                        }
                        for (g gVar : (g[]) spanned.getSpans(0, spanned.length(), g.class)) {
                            gVar.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt(g.f44253d, gVar.f44256a);
                            bundle6.putInt(g.f44254e, gVar.f44257b);
                            bundle6.putInt(g.f44255f, gVar.f44258c);
                            arrayList.add(k1.d.a(spanned, gVar, 2, bundle6));
                        }
                        for (k1.e eVar : (k1.e[]) spanned.getSpans(0, spanned.length(), k1.e.class)) {
                            arrayList.add(k1.d.a(spanned, eVar, 3, null));
                        }
                        for (h hVar : (h[]) spanned.getSpans(0, spanned.length(), h.class)) {
                            hVar.getClass();
                            Bundle bundle7 = new Bundle();
                            bundle7.putString(h.f44259b, hVar.f44260a);
                            arrayList.add(k1.d.a(spanned, hVar, 4, bundle7));
                        }
                        if (!arrayList.isEmpty()) {
                            bundle4.putParcelableArrayList(k1.b.f44218t, arrayList);
                        }
                    }
                }
                bundle4.putSerializable(k1.b.f44219u, bVar.f44226b);
                bundle4.putSerializable(k1.b.f44220v, bVar.f44227c);
                bundle4.putFloat(k1.b.f44223y, bVar.f44229e);
                bundle4.putInt(k1.b.f44224z, bVar.f44230f);
                bundle4.putInt(k1.b.A, bVar.f44231g);
                bundle4.putFloat(k1.b.B, bVar.f44232h);
                bundle4.putInt(k1.b.C, bVar.f44233i);
                bundle4.putInt(k1.b.D, bVar.f44237n);
                bundle4.putFloat(k1.b.E, bVar.f44238o);
                bundle4.putFloat(k1.b.F, bVar.f44234j);
                bundle4.putFloat(k1.b.G, bVar.f44235k);
                bundle4.putBoolean(k1.b.I, bVar.l);
                bundle4.putInt(k1.b.H, bVar.f44236m);
                bundle4.putInt(k1.b.J, bVar.f44239p);
                bundle4.putFloat(k1.b.K, bVar.f44240q);
                bundle4.putInt(k1.b.L, bVar.f44241r);
                if (bitmap2 != null) {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    go.k.t(bitmap2.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream));
                    bundle4.putByteArray(k1.b.f44222x, byteArrayOutputStream.toByteArray());
                }
                return bundle4;
            case 11:
                long j10 = ((k3.a) obj).f44269b;
                if (j10 == C.TIME_UNSET) {
                    j10 = 0;
                }
                return Long.valueOf(j10);
            case 12:
                return new q1.f((u) obj);
            case 13:
                return j0.B(Integer.valueOf(((i) obj).f41380a));
            default:
                r rVar = (r) obj;
                rVar.i();
                return j0.x(q.z(rVar.I.f40387b, new c(i16)));
        }
    }
}
