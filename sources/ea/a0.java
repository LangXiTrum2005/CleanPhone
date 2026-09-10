package ea;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.net.Uri;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.ads.f6;
import com.google.android.gms.internal.measurement.d5;
import com.google.android.gms.internal.measurement.g5;
import com.google.android.gms.internal.measurement.v4;
import com.google.android.gms.internal.measurement.x4;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.perf.config.RemoteConfigManager;
import com.ironsource.InterfaceC0435l1;
import com.ironsource.X3;
import com.ironsource.Xa;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.io.File;
import java.io.IOException;
import java.nio.ShortBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public /* synthetic */ class a0 implements v, vj.a, f4.c, g2.n, gg.a, h6.a, Continuation, hc.d, i6.a, ic.a, he.d {
    public static volatile a0 l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f39202a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ a0 f39190b = new a0(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ a0 f39191c = new a0(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ a0 f39192d = new a0(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ a0 f39193e = new a0(3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ a0 f39194f = new a0(4);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ a0 f39195g = new a0(5);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ a0 f39196h = new a0(6);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ a0 f39197i = new a0(7);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ a0 f39198j = new a0(8);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ a0 f39199k = new a0(9);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ a0 f39200m = new a0(22);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ a0 f39201n = new a0(23);

    public /* synthetic */ a0(int i10) {
        this.f39202a = i10;
    }

    public static Font p(FontFamily fontFamily, int i10) {
        FontStyle fontStyle = new FontStyle((i10 & 1) != 0 ? IronSourceError.ERROR_NT_LOAD_AFTER_INIT_FAILED : 400, (i10 & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int iS = s(fontStyle, font.getStyle());
        for (int i11 = 1; i11 < fontFamily.getSize(); i11++) {
            Font font2 = fontFamily.getFont(i11);
            int iS2 = s(fontStyle, font2.getStyle());
            if (iS2 < iS) {
                font = font2;
                iS = iS2;
            }
        }
        return font;
    }

    public static int s(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    @Override // h6.a
    public Bitmap a(int i10, int i11, Bitmap.Config config) {
        return Bitmap.createBitmap(i10, i11, config);
    }

    @Override // h6.a
    public void b(Bitmap bitmap) {
        bitmap.recycle();
    }

    @Override // g2.n
    public long c() {
        throw new NoSuchElementException();
    }

    @Override // g2.n
    public long d() {
        throw new NoSuchElementException();
    }

    @Override // vj.a
    public Object get() {
        RemoteConfigManager remoteConfigManager = RemoteConfigManager.getInstance();
        com.bumptech.glide.d.j(remoteConfigManager);
        return remoteConfigManager;
    }

    @Override // hc.d
    public hc.b h(v1.j jVar, JSONObject jSONObject) throws JSONException {
        long jCurrentTimeMillis;
        jSONObject.optInt("settings_version", 0);
        int iOptInt = jSONObject.optInt("cache_duration", 3600);
        double dOptDouble = jSONObject.optDouble("on_demand_upload_rate_per_minute", 10.0d);
        double dOptDouble2 = jSONObject.optDouble("on_demand_backoff_base", 1.2d);
        int iOptInt2 = jSONObject.optInt("on_demand_backoff_step_duration_seconds", 60);
        d5.o oVar = jSONObject.has("session") ? new d5.o(jSONObject.getJSONObject("session").optInt("max_custom_exception_events", 8), 11) : new d5.o(new JSONObject().optInt("max_custom_exception_events", 8), 11);
        JSONObject jSONObject2 = jSONObject.getJSONObject(X3.a.f27686v);
        f6 f6Var = new f6(jSONObject2.optBoolean("collect_reports", true), jSONObject2.optBoolean("collect_anrs", false), jSONObject2.optBoolean("collect_build_ids", false));
        long j10 = iOptInt;
        if (jSONObject.has("expires_at")) {
            jCurrentTimeMillis = jSONObject.optLong("expires_at");
        } else {
            jCurrentTimeMillis = (j10 * 1000) + System.currentTimeMillis();
        }
        return new hc.b(jCurrentTimeMillis, oVar, f6Var, dOptDouble, dOptDouble2, iOptInt2);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x007f  */
    @Override // he.d
    public ke.b i(String str, int i10, EnumMap enumMap) {
        int i11;
        char c4;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        ke.a aVarC;
        int i17;
        ke.a aVarC2;
        int i18;
        int iAbs;
        ke.a aVarB;
        int i19;
        int i20;
        Charset charsetForName = StandardCharsets.ISO_8859_1;
        he.a aVar = he.a.f42325b;
        if (enumMap.containsKey(aVar)) {
            charsetForName = Charset.forName(enumMap.get(aVar).toString());
        }
        he.a aVar2 = he.a.f42324a;
        int i21 = enumMap.containsKey(aVar2) ? Integer.parseInt(enumMap.get(aVar2).toString()) : 33;
        he.a aVar3 = he.a.f42333j;
        int i22 = enumMap.containsKey(aVar3) ? Integer.parseInt(enumMap.get(aVar3).toString()) : 0;
        int i23 = 1;
        if (i10 != 1) {
            throw new IllegalArgumentException("Can only encode AZTEC, but got ".concat(d5.u.A(i10)));
        }
        byte[] bytes = str.getBytes(charsetForName);
        List<je.e> listSingletonList = Collections.singletonList(je.e.f43828e);
        int i24 = 0;
        while (true) {
            int i25 = 4;
            i11 = 2;
            c4 = '\n';
            i12 = 5;
            i13 = 3;
            i14 = 32;
            if (i24 >= bytes.length) {
                break;
            }
            int i26 = i24 + 1;
            byte b10 = i26 < bytes.length ? bytes[i26] : (byte) 0;
            byte b11 = bytes[i24];
            if (b11 != 13) {
                if (b11 != 44) {
                    if (b11 != 46) {
                        if (b11 != 58 || b10 != 32) {
                            i12 = 0;
                        }
                    } else if (b10 == 32) {
                        i12 = 3;
                    } else {
                        i12 = 0;
                    }
                } else if (b10 == 32) {
                    i12 = 4;
                } else {
                    i12 = 0;
                }
            } else if (b10 == 10) {
                i12 = 2;
            } else {
                i12 = 0;
            }
            if (i12 > 0) {
                LinkedList linkedList = new LinkedList();
                for (je.e eVar : listSingletonList) {
                    je.e eVarB = eVar.b(i24);
                    linkedList.add(eVarB.d(4, i12));
                    if (eVar.f43829a != 4) {
                        linkedList.add(eVarB.e(4, i12));
                    }
                    if (i12 == 3 || i12 == 4) {
                        linkedList.add(eVarB.d(2, 16 - i12).d(2, i23));
                    }
                    if (eVar.f43831c > 0) {
                        linkedList.add(eVar.a(i24).a(i26));
                    }
                }
                listSingletonList = je.c.a(linkedList);
                i20 = i23;
                i24 = i26;
            } else {
                LinkedList linkedList2 = new LinkedList();
                for (je.e eVar2 : listSingletonList) {
                    char c5 = (char) (bytes[i24] & 255);
                    int[][] iArr = je.c.f43824c;
                    int i27 = eVar2.f43829a;
                    int i28 = iArr[i27][c5] > 0 ? i23 : 0;
                    int i29 = 0;
                    je.e eVarB2 = null;
                    while (i29 <= i25) {
                        int i30 = i23;
                        int i31 = iArr[i29][c5];
                        if (i31 > 0) {
                            if (eVarB2 == null) {
                                eVarB2 = eVar2.b(i24);
                            }
                            if (i28 == 0 || i29 == i27 || i29 == 2) {
                                linkedList2.add(eVarB2.d(i29, i31));
                            }
                            if (i28 == 0 && je.c.f43825d[i27][i29] >= 0) {
                                linkedList2.add(eVarB2.e(i29, i31));
                            }
                        }
                        i29++;
                        i23 = i30;
                        i25 = 4;
                    }
                    int i32 = i23;
                    if (eVar2.f43831c > 0 || iArr[i27][c5] == 0) {
                        linkedList2.add(eVar2.a(i24));
                    }
                    i23 = i32;
                    i25 = 4;
                }
                i20 = i23;
                listSingletonList = je.c.a(linkedList2);
            }
            i24++;
            i23 = i20;
        }
        int i33 = i23;
        je.e eVar3 = (je.e) Collections.min(listSingletonList, new ae.l(9));
        eVar3.getClass();
        LinkedList linkedList3 = new LinkedList();
        for (je.f fVar = eVar3.b(bytes.length).f43830b; fVar != null; fVar = fVar.f43834a) {
            linkedList3.addFirst(fVar);
        }
        ke.a aVar4 = new ke.a();
        Iterator it = linkedList3.iterator();
        while (it.hasNext()) {
            ((je.f) it.next()).a(aVar4, bytes);
        }
        int i34 = aVar4.f44613b;
        int iD = defpackage.e.D(i34, i21, 100, 11);
        int i35 = i34 + iD;
        int[] iArr2 = je.b.f43821a;
        if (i22 != 0) {
            i18 = i22 < 0 ? i33 : 0;
            iAbs = Math.abs(i22);
            if (iAbs > (i18 != 0 ? 4 : 32)) {
                throw new IllegalArgumentException(defpackage.e.h(i22, "Illegal value ", " for layers"));
            }
            i15 = ((i18 != 0 ? 88 : InterfaceC0435l1.d.b.f29113j) + (iAbs << 4)) * iAbs;
            i17 = iArr2[iAbs];
            int i36 = i15 - (i15 % i17);
            aVarC2 = je.b.c(aVar4, i17);
            int i37 = aVarC2.f44613b;
            if (iD + i37 > i36) {
                throw new IllegalArgumentException("Data to large for user specified layer");
            }
            if (i18 != 0 && i37 > (i17 << 6)) {
                throw new IllegalArgumentException("Data to large for user specified layer");
            }
        } else {
            int i38 = 0;
            int i39 = 0;
            ke.a aVar5 = null;
            while (true) {
                if (i38 > i14) {
                    throw new IllegalArgumentException("Data too large for an Aztec code");
                }
                int i40 = i38 <= i13 ? i33 : 0;
                int i41 = i40 != 0 ? i38 + 1 : i38;
                i15 = ((i40 != 0 ? 88 : InterfaceC0435l1.d.b.f29113j) + (i41 << 4)) * i41;
                if (i35 <= i15) {
                    if (aVar5 == null || i39 != iArr2[i41]) {
                        i16 = iArr2[i41];
                        aVarC = je.b.c(aVar4, i16);
                    } else {
                        i16 = i39;
                        aVarC = aVar5;
                    }
                    int i42 = i15 - (i15 % i16);
                    if ((i40 == 0 || aVarC.f44613b <= (i16 << 6)) && aVarC.f44613b + iD <= i42) {
                        i17 = i16;
                        aVarC2 = aVarC;
                        i18 = i40;
                        iAbs = i41;
                        break;
                    }
                    aVar5 = aVarC;
                    i39 = i16;
                }
                i38++;
                i12 = i12;
                c4 = c4;
                i11 = i11;
                i13 = 3;
                i14 = 32;
            }
        }
        ke.a aVarB2 = je.b.b(aVarC2, i15, i17);
        int i43 = aVarC2.f44613b / i17;
        ke.a aVar6 = new ke.a();
        if (i18 != 0) {
            aVar6.b(iAbs - 1, i11);
            aVar6.b(i43 - 1, 6);
            aVarB = je.b.b(aVar6, 28, 4);
        } else {
            aVar6.b(iAbs - 1, i12);
            aVar6.b(i43 - 1, 11);
            aVarB = je.b.b(aVar6, 40, 4);
        }
        int i44 = (i18 == 0 ? 14 : 11) + (iAbs << 2);
        int[] iArr3 = new int[i44];
        if (i18 != 0) {
            for (int i45 = 0; i45 < i44; i45++) {
                iArr3[i45] = i45;
            }
            i19 = i44;
        } else {
            int i46 = i44 / 2;
            i19 = (((i46 - 1) / 15) * i11) + i44 + 1;
            int i47 = i19 / 2;
            for (int i48 = 0; i48 < i46; i48++) {
                int i49 = (i48 / 15) + i48;
                iArr3[(i46 - i48) - 1] = (i47 - i49) - 1;
                iArr3[i46 + i48] = i49 + i47 + 1;
            }
        }
        ke.b bVar = new ke.b(i19, i19);
        int i50 = 0;
        int i51 = 0;
        while (i50 < iAbs) {
            int i52 = ((iAbs - i50) << i11) + (i18 != 0 ? 9 : 12);
            for (int i53 = 0; i53 < i52; i53++) {
                int i54 = i53 << 1;
                int i55 = 0;
                while (i55 < i11) {
                    int i56 = i11;
                    if (aVarB2.d(i51 + i54 + i55)) {
                        int i57 = i50 << 1;
                        bVar.b(iArr3[i57 + i55], iArr3[i57 + i53]);
                    }
                    if (aVarB2.d((i52 << 1) + i51 + i54 + i55)) {
                        int i58 = i50 << 1;
                        bVar.b(iArr3[i58 + i53], iArr3[((i44 - 1) - i58) - i55]);
                    }
                    if (aVarB2.d((i52 << 2) + i51 + i54 + i55)) {
                        int i59 = (i44 - 1) - (i50 << 1);
                        bVar.b(iArr3[i59 - i55], iArr3[i59 - i53]);
                    }
                    if (aVarB2.d((i52 * 6) + i51 + i54 + i55)) {
                        int i60 = i50 << 1;
                        bVar.b(iArr3[((i44 - 1) - i60) - i53], iArr3[i60 + i55]);
                    }
                    i55++;
                    i11 = i56;
                }
            }
            i51 += i52 << 3;
            i50++;
            i11 = i11;
        }
        int i61 = i19 / 2;
        if (i18 != 0) {
            for (int i62 = 0; i62 < 7; i62++) {
                int i63 = (i61 - 3) + i62;
                if (aVarB.d(i62)) {
                    bVar.b(i63, i61 - 5);
                }
                if (aVarB.d(i62 + 7)) {
                    bVar.b(i61 + 5, i63);
                }
                if (aVarB.d(20 - i62)) {
                    bVar.b(i63, i61 + 5);
                }
                if (aVarB.d(27 - i62)) {
                    bVar.b(i61 - 5, i63);
                }
            }
        } else {
            for (int i64 = 0; i64 < 10; i64++) {
                int i65 = (i64 / 5) + (i61 - 5) + i64;
                if (aVarB.d(i64)) {
                    bVar.b(i65, i61 - 7);
                }
                if (aVarB.d(i64 + 10)) {
                    bVar.b(i61 + 7, i65);
                }
                if (aVarB.d(29 - i64)) {
                    bVar.b(i65, i61 + 7);
                }
                if (aVarB.d(39 - i64)) {
                    bVar.b(i61 - 7, i65);
                }
            }
        }
        if (i18 != 0) {
            je.b.a(bVar, i61, 5);
        } else {
            je.b.a(bVar, i61, 7);
            int i66 = 0;
            int i67 = 0;
            while (i66 < (i44 / 2) - 1) {
                for (int i68 = i61 & 1; i68 < i19; i68 += 2) {
                    int i69 = i61 - i67;
                    bVar.b(i69, i68);
                    int i70 = i61 + i67;
                    bVar.b(i70, i68);
                    bVar.b(i68, i69);
                    bVar.b(i68, i70);
                }
                i66 += 15;
                i67 += 16;
            }
        }
        int i71 = bVar.f44614a;
        int iMax = Math.max(200, i71);
        int i72 = bVar.f44615b;
        int iMax2 = Math.max(200, i72);
        int iMin = Math.min(iMax / i71, iMax2 / i72);
        int i73 = (iMax - (i71 * iMin)) / 2;
        int i74 = (iMax2 - (i72 * iMin)) / 2;
        ke.b bVar2 = new ke.b(iMax, iMax2);
        int i75 = 0;
        while (i75 < i72) {
            int i76 = i73;
            int i77 = 0;
            while (i77 < i71) {
                if (bVar.a(i77, i75)) {
                    bVar2.c(i76, i74, iMin, iMin);
                }
                i77++;
                i76 += iMin;
            }
            i75++;
            i74 += iMin;
        }
        return bVar2;
    }

    @Override // i6.a
    public File j(e6.f fVar) {
        return null;
    }

    @Override // ic.a
    public StackTraceElement[] j0(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= 1024) {
            return stackTraceElementArr;
        }
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[1024];
        System.arraycopy(stackTraceElementArr, 0, stackTraceElementArr2, 0, 512);
        System.arraycopy(stackTraceElementArr, stackTraceElementArr.length - 512, stackTraceElementArr2, 512, 512);
        return stackTraceElementArr2;
    }

    @Override // gg.a
    public void m(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11, int i12) {
        switch (this.f39202a) {
            case 19:
                if (i10 < i11) {
                    throw new IllegalArgumentException("Illegal use of DownsampleAudioResampler");
                }
                if (i12 != 1 && i12 != 2) {
                    throw new IllegalArgumentException(l1.d.e(i12, "Illegal use of DownsampleAudioResampler. Channels:"));
                }
                int iRemaining = shortBuffer.remaining() / i12;
                int iCeil = (int) Math.ceil((((double) i11) / ((double) i10)) * ((double) iRemaining));
                int i13 = iRemaining - iCeil;
                float f10 = iCeil;
                float f11 = f10 / f10;
                float f12 = i13;
                float f13 = f12 / f12;
                while (iCeil > 0 && i13 > 0) {
                    if (f11 >= f13) {
                        shortBuffer2.put(shortBuffer.get());
                        if (i12 == 2) {
                            shortBuffer2.put(shortBuffer.get());
                        }
                        iCeil--;
                        f11 = iCeil / f10;
                    } else {
                        shortBuffer.position(shortBuffer.position() + i12);
                        i13--;
                        f13 = i13 / f12;
                    }
                }
                return;
            default:
                if (i10 > i11) {
                    throw new IllegalArgumentException("Illegal use of UpsampleAudioResampler");
                }
                if (i12 != 1 && i12 != 2) {
                    throw new IllegalArgumentException(l1.d.e(i12, "Illegal use of UpsampleAudioResampler. Channels:"));
                }
                int iRemaining2 = shortBuffer.remaining() / i12;
                int iCeil2 = ((int) Math.ceil((((double) i11) / ((double) i10)) * ((double) iRemaining2))) - iRemaining2;
                float f14 = iRemaining2;
                float f15 = f14 / f14;
                float f16 = iCeil2;
                float f17 = f16 / f16;
                while (iRemaining2 > 0 && iCeil2 > 0) {
                    if (f15 >= f17) {
                        shortBuffer2.put(shortBuffer.get());
                        if (i12 == 2) {
                            shortBuffer2.put(shortBuffer.get());
                        }
                        iRemaining2--;
                        f15 = iRemaining2 / f14;
                    } else {
                        shortBuffer2.put(shortBuffer2.get(shortBuffer2.position() - i12));
                        if (i12 == 2) {
                            shortBuffer2.put(shortBuffer2.get(shortBuffer2.position() - i12));
                        }
                        iCeil2--;
                        f17 = iCeil2 / f16;
                    }
                }
                return;
        }
    }

    @Override // h6.a
    public Bitmap n(int i10, int i11, Bitmap.Config config) {
        return Bitmap.createBitmap(i10, i11, config);
    }

    @Override // g2.n
    public boolean next() {
        return false;
    }

    public Typeface o(Context context, List list, int i10) {
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily fontFamilyQ = q((j0.i[]) list.get(0), contentResolver);
            if (fontFamilyQ == null) {
                return null;
            }
            Typeface.CustomFallbackBuilder customFallbackBuilder = new Typeface.CustomFallbackBuilder(fontFamilyQ);
            for (int i11 = 1; i11 < list.size(); i11++) {
                FontFamily fontFamilyQ2 = q((j0.i[]) list.get(i11), contentResolver);
                if (fontFamilyQ2 != null) {
                    customFallbackBuilder.addCustomFallback(fontFamilyQ2);
                }
            }
            return customFallbackBuilder.setStyle(p(fontFamilyQ, i10).getStyle()).build();
        } catch (Exception e10) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e10);
            return null;
        }
    }

    public FontFamily q(j0.i[] iVarArr, ContentResolver contentResolver) {
        Font fontBuild;
        FontFamily.Builder builder = null;
        for (j0.i iVar : iVarArr) {
            if (Objects.equals(iVar.f43569a.getScheme(), "systemfont")) {
                fontBuild = r(iVar);
            } else {
                try {
                    Uri uri = iVar.f43569a;
                    String str = iVar.f43573e;
                    ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(uri, "r", null);
                    if (parcelFileDescriptorOpenFileDescriptor == null) {
                        if (parcelFileDescriptorOpenFileDescriptor != null) {
                            parcelFileDescriptorOpenFileDescriptor.close();
                        }
                        fontBuild = null;
                    } else {
                        try {
                            Font.Builder ttcIndex = new Font.Builder(parcelFileDescriptorOpenFileDescriptor).setWeight(iVar.f43571c).setSlant(iVar.f43572d ? 1 : 0).setTtcIndex(iVar.f43570b);
                            if (!TextUtils.isEmpty(str)) {
                                ttcIndex.setFontVariationSettings(str);
                            }
                            fontBuild = ttcIndex.build();
                            parcelFileDescriptorOpenFileDescriptor.close();
                        } catch (Throwable th2) {
                            try {
                                parcelFileDescriptorOpenFileDescriptor.close();
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                            }
                            throw th2;
                        }
                    }
                } catch (IOException e10) {
                    Log.w("TypefaceCompatApi29Impl", "Font load failed", e10);
                    fontBuild = null;
                }
            }
            if (fontBuild != null) {
                if (builder == null) {
                    builder = new FontFamily.Builder(fontBuild);
                } else {
                    builder.addFont(fontBuild);
                }
            }
        }
        if (builder == null) {
            return null;
        }
        return builder.build();
    }

    public Font r(j0.i iVar) {
        throw new UnsupportedOperationException("Getting font from Typeface is not supported before API31");
    }

    @Override // com.google.android.gms.tasks.Continuation
    public /* synthetic */ Object then(Task task) throws IOException {
        switch (this.f39202a) {
            case 22:
                Intent intent = (Intent) ((Bundle) task.getResult()).getParcelable("notification_data");
                if (intent != null) {
                    return new h9.a(intent);
                }
                return null;
            default:
                if (task.isSuccessful()) {
                    return (Bundle) task.getResult();
                }
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Error making request: ".concat(String.valueOf(task.getException())));
                }
                throw new IOException("SERVICE_NOT_AVAILABLE", task.getException());
        }
    }

    @Override // ea.v
    public Object zza() {
        switch (this.f39202a) {
            case 0:
                List list = d0.f39287a;
                return (Boolean) com.google.android.gms.internal.measurement.b4.f23314b.get();
            case 1:
                List list2 = d0.f39287a;
                com.google.android.gms.internal.measurement.g3.f23501b.get();
                return Integer.valueOf((int) ((Long) com.google.android.gms.internal.measurement.i3.f23571a.f(70, 1000L, "measurement.upload.max_events_per_bundle").get()).longValue());
            case 2:
                List list3 = d0.f39287a;
                v4.f24075b.get();
                return (Boolean) x4.f24140a.b(6, "measurement.rb.attribution.service", true).get();
            case 3:
                List list4 = d0.f39287a;
                v4.f24075b.get();
                return (Boolean) x4.f24140a.b(8, "measurement.rb.attribution.uuid_generation", true).get();
            case 4:
                List list5 = d0.f39287a;
                v4.f24075b.get();
                return (Boolean) x4.f24140a.b(4, "measurement.rb.attribution.service.enable_max_trigger_uris_queried_at_once", true).get();
            case 5:
                List list6 = d0.f39287a;
                v4.f24075b.get();
                return (Boolean) x4.f24140a.b(2, "measurement.rb.attribution.service.trigger_uris_high_priority", true).get();
            case 6:
                List list7 = d0.f39287a;
                return (Boolean) d5.f23381a.get();
            case 7:
                List list8 = d0.f39287a;
                com.google.android.gms.internal.measurement.g3.f23501b.get();
                return (Long) com.google.android.gms.internal.measurement.i3.f23571a.f(0, Xa.f27908s, "measurement.ad_id_cache_time").get();
            case 8:
                return new Boolean(((Boolean) com.google.android.gms.internal.measurement.k4.f23634b.get()).booleanValue());
            default:
                return new Boolean(((Boolean) g5.f23503a.get()).booleanValue());
        }
    }

    public a0(k5.g gVar) {
        this.f39202a = 11;
    }

    public a0() {
        this.f39202a = 12;
        new ConcurrentHashMap();
    }

    @Override // i6.a
    public void clear() {
    }

    @Override // f4.c
    public void f() {
    }

    @Override // h6.a
    public void k() {
    }

    @Override // h6.a
    public void e(int i10) {
    }

    @Override // f4.c
    public void g(int i10, Object obj) {
    }

    @Override // i6.a
    public void l(e6.f fVar, v9.e eVar) {
    }
}
