package d8;

import android.app.Activity;
import android.app.Application;
import android.app.PendingIntent;
import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.MediaStore;
import android.util.Log;
import cc.a2;
import com.google.android.gms.internal.ads.dm0;
import com.google.android.gms.internal.ads.ln0;
import com.google.android.gms.internal.play_billing.q1;
import com.ironsource.O6;
import com.ironsource.gi;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import go.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import n6.e0;
import qk.i0;
import wi.j;
import wj.r;
import xi.m;
import xi.n;
import xj.b0;
import xj.o;
import xj.p;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements n {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final ThreadPoolExecutor f38774j = new ThreadPoolExecutor(8, Integer.MAX_VALUE, 1, TimeUnit.MINUTES, new LinkedBlockingQueue());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f38775a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Activity f38776b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i8.c f38777c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b f38778d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i f38779e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c f38780f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ln0 f38781g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a f38782h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f38783i;

    public f(Context applicationContext, xi.f messenger, i8.c permissionsUtils) {
        kotlin.jvm.internal.n.f(applicationContext, "applicationContext");
        kotlin.jvm.internal.n.f(messenger, "messenger");
        kotlin.jvm.internal.n.f(permissionsUtils, "permissionsUtils");
        this.f38775a = applicationContext;
        this.f38776b = null;
        this.f38777c = permissionsUtils;
        permissionsUtils.f42915g = new s4.i(this);
        this.f38778d = new b(applicationContext);
        this.f38779e = new i(this.f38776b, applicationContext);
        this.f38780f = new c(applicationContext);
        this.f38781g = new ln0(applicationContext, messenger, new Handler(Looper.getMainLooper()));
        this.f38782h = new a(applicationContext);
    }

    public static int b(m mVar, String str) {
        Object objA = mVar.a(str);
        kotlin.jvm.internal.n.c(objA);
        return ((Number) objA).intValue();
    }

    public static a2 c(m mVar) {
        Map map = (Map) mVar.a("option");
        if (map == null) {
            return null;
        }
        Object obj = map.get("type");
        kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.Int");
        int iIntValue = ((Integer) obj).intValue();
        Object obj2 = map.get("child");
        kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.Map<*, *>");
        Map map2 = (Map) obj2;
        if (iIntValue == 0) {
            return new f8.a(map2);
        }
        if (iIntValue == 1) {
            return new f8.b(map2);
        }
        throw new IllegalStateException(defpackage.e.h(iIntValue, "Unknown type ", " for filter option."));
    }

    public final void a(Activity activity) {
        this.f38776b = activity;
        i8.c cVar = this.f38777c;
        cVar.f42909a = activity;
        cVar.f42910b = activity != null ? activity.getApplication() : null;
        this.f38778d.f38762b = activity;
        this.f38779e.f38789b = activity;
        this.f38780f.f38766b = activity;
    }

    /* JADX WARN: Code duplicated, block: B:222:0x0680  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void d(l8.b bVar, boolean z10) throws Exception {
        char c4;
        Uri EXTERNAL_CONTENT_URI;
        e8.b bVarX;
        long jK;
        ArrayList arrayListB0;
        String strJ;
        m mVar = bVar.f45244b;
        String method = mVar.f53822a;
        if (method != null) {
            int iHashCode = method.hashCode();
            b bVar2 = this.f38778d;
            a aVar = this.f38782h;
            switch (iHashCode) {
                case -2060338679:
                    if (method.equals("saveImageWithPath")) {
                        try {
                            Object objA = mVar.a("path");
                            kotlin.jvm.internal.n.c(objA);
                            String str = (String) objA;
                            Object objA2 = mVar.a("title");
                            kotlin.jvm.internal.n.c(objA2);
                            String str2 = (String) objA2;
                            String str3 = (String) mVar.a(CampaignEx.JSON_KEY_DESC);
                            String str4 = str3 == null ? "" : str3;
                            String str5 = (String) mVar.a("relativePath");
                            bVar.b(k.w(this.f38782h.f(str, str2, str4, str5 == null ? "" : str5, (Integer) mVar.a("orientation"), (Double) mVar.a("latitude"), (Double) mVar.a("longitude"), (Long) mVar.a("creationDate"))));
                            return;
                        } catch (Exception e10) {
                            l8.a.c("save image error", e10);
                            kotlin.jvm.internal.n.e(method, "method");
                            bVar.c(method, null, e10);
                            return;
                        }
                    }
                    break;
                case -1793329916:
                    if (method.equals("removeNoExistsAssets")) {
                        aVar.e(bVar);
                        return;
                    }
                    break;
                case -1701237244:
                    if (method.equals("getAssetCountFromPath")) {
                        Object objA3 = mVar.a("id");
                        kotlin.jvm.internal.n.c(objA3);
                        aVar.a(bVar, c(mVar), b(mVar, "type"), (String) objA3);
                        return;
                    }
                    break;
                case -1491493556:
                    if (method.equals("getPathRelativePath")) {
                        Object objA4 = mVar.a("id");
                        kotlin.jvm.internal.n.c(objA4);
                        bVar.b(aVar.c((String) objA4));
                        return;
                    }
                    break;
                case -1491271588:
                    if (method.equals("getColumnNames")) {
                        bVar.b(aVar.b().m(aVar.f38758a));
                        return;
                    }
                    break;
                case -1283288098:
                    if (method.equals("getLatLngAndroidQ")) {
                        Object objA5 = mVar.a("id");
                        kotlin.jvm.internal.n.c(objA5);
                        double[] dArrY = aVar.b().y(aVar.f38758a, (String) objA5);
                        bVar.b(dArrY == null ? b0.Q(new wj.f(O6.f26746s, null), new wj.f("lng", null)) : b0.Q(new wj.f(O6.f26746s, Double.valueOf(dArrY[0])), new wj.f("lng", Double.valueOf(dArrY[1]))));
                        return;
                    }
                    break;
                case -1257373420:
                    if (method.equals("moveAssetsToPath")) {
                        try {
                            Object objA6 = mVar.a("assetIds");
                            kotlin.jvm.internal.n.c(objA6);
                            Object objA7 = mVar.a("targetPath");
                            kotlin.jvm.internal.n.c(objA7);
                            String str6 = (String) objA7;
                            List list = (List) objA6;
                            ArrayList arrayList = new ArrayList(p.W(list, 10));
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                arrayList.add(aVar.d((String) it.next()));
                            }
                            if (arrayList.isEmpty()) {
                                bVar.c("No valid URIs found for the given asset IDs", null, null);
                                return;
                            } else {
                                this.f38779e.a(arrayList, str6, bVar);
                                return;
                            }
                        } catch (Exception e11) {
                            l8.a.c("moveAssetsToPath failed", e11);
                            bVar.c("moveAssetsToPath failed", e11.getMessage(), null);
                            return;
                        }
                    }
                    break;
                case -1167306339:
                    if (method.equals("getAssetListPaged")) {
                        Object objA8 = mVar.a("id");
                        kotlin.jvm.internal.n.c(objA8);
                        String str7 = (String) objA8;
                        Object objA9 = mVar.a("type");
                        kotlin.jvm.internal.n.c(objA9);
                        int iIntValue = ((Number) objA9).intValue();
                        Object objA10 = mVar.a("page");
                        kotlin.jvm.internal.n.c(objA10);
                        int iIntValue2 = ((Number) objA10).intValue();
                        Object objA11 = mVar.a("size");
                        kotlin.jvm.internal.n.c(objA11);
                        int iIntValue3 = ((Number) objA11).intValue();
                        a2 a2VarC = c(mVar);
                        aVar.getClass();
                        bVar.b(k.x(aVar.b().o(aVar.f38758a, str7.equals("isAll") ? "" : str7, iIntValue2, iIntValue3, iIntValue, a2VarC)));
                        return;
                    }
                    break;
                case -1165452507:
                    if (method.equals("getAssetListRange")) {
                        Object objA12 = mVar.a("id");
                        kotlin.jvm.internal.n.c(objA12);
                        String str8 = (String) objA12;
                        int iB = b(mVar, "type");
                        int iB2 = b(mVar, "start");
                        int iB3 = b(mVar, TtmlNode.END);
                        a2 a2VarC2 = c(mVar);
                        aVar.getClass();
                        bVar.b(k.x(aVar.b().b(aVar.f38758a, str8.equals("isAll") ? "" : str8, iB2, iB3, iB, a2VarC2)));
                        return;
                    }
                    break;
                case -1039689911:
                    if (method.equals("notify")) {
                        boolean zA = kotlin.jvm.internal.n.a((Boolean) mVar.a("notify"), Boolean.TRUE);
                        ln0 ln0Var = this.f38781g;
                        if (!zA) {
                            Context context = (Context) ln0Var.f17071b;
                            if (ln0Var.f17070a) {
                                ln0Var.f17070a = false;
                                context.getContentResolver().unregisterContentObserver((d) ln0Var.f17073d);
                                context.getContentResolver().unregisterContentObserver((d) ln0Var.f17072c);
                                context.getContentResolver().unregisterContentObserver((d) ln0Var.f17074e);
                            }
                        } else if (!ln0Var.f17070a) {
                            d dVar = (d) ln0Var.f17073d;
                            Uri imageUri = (Uri) ln0Var.f17076g;
                            kotlin.jvm.internal.n.e(imageUri, "imageUri");
                            ln0Var.h(dVar, imageUri);
                            d dVar2 = (d) ln0Var.f17072c;
                            Uri videoUri = (Uri) ln0Var.f17077h;
                            kotlin.jvm.internal.n.e(videoUri, "videoUri");
                            ln0Var.h(dVar2, videoUri);
                            d dVar3 = (d) ln0Var.f17074e;
                            Uri audioUri = (Uri) ln0Var.f17078i;
                            kotlin.jvm.internal.n.e(audioUri, "audioUri");
                            ln0Var.h(dVar3, audioUri);
                            ln0Var.f17070a = true;
                        }
                        bVar.b(null);
                        return;
                    }
                    break;
                case -1033607060:
                    if (method.equals("moveToTrash")) {
                        try {
                            Object objA13 = mVar.a("ids");
                            kotlin.jvm.internal.n.c(objA13);
                            List list2 = (List) objA13;
                            ArrayList arrayList2 = new ArrayList(p.W(list2, 10));
                            Iterator it2 = list2.iterator();
                            while (it2.hasNext()) {
                                arrayList2.add(aVar.d((String) it2.next()));
                            }
                            bVar2.c(xj.n.N0(arrayList2), bVar);
                            return;
                        } catch (Exception e12) {
                            l8.a.c("deleteWithIds failed", e12);
                            bVar.c("deleteWithIds failed", null, null);
                            return;
                        }
                    }
                    break;
                case -948382752:
                    if (method.equals("requestCacheAssetsThumb")) {
                        Object objA14 = mVar.a("ids");
                        kotlin.jvm.internal.n.c(objA14);
                        Object objA15 = mVar.a("option");
                        kotlin.jvm.internal.n.c(objA15);
                        e8.d dVarP = q1.p((Map) objA15);
                        ArrayList arrayList3 = aVar.f38760c;
                        g8.f fVarB = aVar.b();
                        Context context2 = aVar.f38758a;
                        for (String path : fVarB.h(context2, (List) objA14)) {
                            kotlin.jvm.internal.n.f(context2, "context");
                            kotlin.jvm.internal.n.f(path, "path");
                            com.bumptech.glide.i iVarX = com.bumptech.glide.b.c(context2).h().a(((w6.f) new w6.f().k(e0.f46578d, Long.valueOf(dVarP.f39181e))).h(com.bumptech.glide.f.f10478d)).x(path);
                            int i10 = dVarP.f39177a;
                            int i11 = dVarP.f39178b;
                            iVarX.getClass();
                            w6.e eVar = new w6.e(i10, i11);
                            iVarX.v(eVar, eVar, a7.h.f3430b);
                            arrayList3.add(eVar);
                        }
                        bVar.b(1);
                        Iterator it3 = xj.n.N0(arrayList3).iterator();
                        while (it3.hasNext()) {
                            a.f38757d.execute(new com.mbridge.msdk.config.component.info.provider.subprovider.f((w6.e) it3.next(), 11));
                        }
                        return;
                    }
                    break;
                case -904801612:
                    if (method.equals("favoriteAsset")) {
                        Object objA16 = mVar.a("id");
                        kotlin.jvm.internal.n.c(objA16);
                        Object objA17 = mVar.a("favorite");
                        kotlin.jvm.internal.n.c(objA17);
                        boolean zBooleanValue = ((Boolean) objA17).booleanValue();
                        Uri uriD = aVar.d((String) objA16);
                        c cVar = this.f38780f;
                        cVar.f38768d = bVar;
                        PendingIntent pendingIntentCreateFavoriteRequest = MediaStore.createFavoriteRequest(((Context) cVar.f38767c).getContentResolver(), i0.k0(uriD), zBooleanValue);
                        kotlin.jvm.internal.n.e(pendingIntentCreateFavoriteRequest, "createFavoriteRequest(...)");
                        Activity activity = cVar.f38766b;
                        if (activity != null) {
                            activity.startIntentSenderForResult(pendingIntentCreateFavoriteRequest.getIntentSender(), 40071, null, 0, 0, 0);
                            return;
                        }
                        return;
                    }
                    break;
                case -886445535:
                    if (method.equals("getFullFile")) {
                        Object objA18 = mVar.a("id");
                        kotlin.jvm.internal.n.c(objA18);
                        String str9 = (String) objA18;
                        if (z10) {
                            Object objA19 = mVar.a("isOrigin");
                            kotlin.jvm.internal.n.c(objA19);
                        }
                        bVar.b(aVar.b().g(aVar.f38758a, str9));
                        return;
                    }
                    break;
                case -626940993:
                    if (method.equals("moveAssetToPath")) {
                        Object objA20 = mVar.a("assetId");
                        kotlin.jvm.internal.n.c(objA20);
                        String str10 = (String) objA20;
                        Object objA21 = mVar.a("albumId");
                        kotlin.jvm.internal.n.c(objA21);
                        String str11 = (String) objA21;
                        aVar.getClass();
                        try {
                            bVar.b(k.w(aVar.b().C(aVar.f38758a, str10, str11)));
                            return;
                        } catch (Exception e13) {
                            l8.a.b(e13);
                            bVar.c("moveAsset", "Failed to move asset " + str10 + " to album " + str11, e13);
                            return;
                        }
                    }
                    break;
                case -251432256:
                    if (method.equals("restoreFromTrash")) {
                        try {
                            Object objA22 = mVar.a("ids");
                            kotlin.jvm.internal.n.c(objA22);
                            List list3 = (List) objA22;
                            Object objA23 = mVar.a("types");
                            kotlin.jvm.internal.n.c(objA23);
                            List list4 = (List) objA23;
                            if (list3.size() != list4.size()) {
                                throw new IllegalArgumentException("restoreFromTrash requires one asset type for each ID");
                            }
                            List list5 = list3;
                            ArrayList arrayList4 = new ArrayList(p.W(list5, 10));
                            int i12 = 0;
                            for (Object obj : list5) {
                                int i13 = i12 + 1;
                                if (i12 < 0) {
                                    o.V();
                                    throw null;
                                }
                                long j10 = Long.parseLong((String) obj);
                                int iIntValue4 = ((Number) list4.get(i12)).intValue();
                                if (iIntValue4 == 1) {
                                    c4 = 1;
                                } else if (iIntValue4 != 2) {
                                    c4 = iIntValue4 != 3 ? (char) 0 : (char) 2;
                                } else {
                                    c4 = 3;
                                }
                                if (c4 == 1) {
                                    EXTERNAL_CONTENT_URI = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                                    kotlin.jvm.internal.n.e(EXTERNAL_CONTENT_URI, "EXTERNAL_CONTENT_URI");
                                } else if (c4 == 2) {
                                    EXTERNAL_CONTENT_URI = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
                                    kotlin.jvm.internal.n.e(EXTERNAL_CONTENT_URI, "EXTERNAL_CONTENT_URI");
                                } else if (c4 != 3) {
                                    g8.f.f41737a.getClass();
                                    EXTERNAL_CONTENT_URI = g8.e.a();
                                } else {
                                    EXTERNAL_CONTENT_URI = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                                    kotlin.jvm.internal.n.e(EXTERNAL_CONTENT_URI, "EXTERNAL_CONTENT_URI");
                                }
                                Uri uriWithAppendedId = ContentUris.withAppendedId(EXTERNAL_CONTENT_URI, j10);
                                kotlin.jvm.internal.n.e(uriWithAppendedId, "withAppendedId(...)");
                                arrayList4.add(uriWithAppendedId);
                                i12 = i13;
                            }
                            bVar2.d(arrayList4, bVar);
                            return;
                        } catch (Exception e14) {
                            l8.a.c("restoreFromTrash failed", e14);
                            bVar.c("restoreFromTrash failed", e14.getMessage(), null);
                            return;
                        }
                    }
                    break;
                case -151967598:
                    if (method.equals("fetchPathProperties")) {
                        Object objA24 = mVar.a("id");
                        kotlin.jvm.internal.n.c(objA24);
                        String str12 = (String) objA24;
                        Object objA25 = mVar.a("type");
                        kotlin.jvm.internal.n.c(objA25);
                        int iIntValue5 = ((Number) objA25).intValue();
                        a2 a2VarC3 = c(mVar);
                        Context context3 = aVar.f38758a;
                        if (str12.equals("isAll")) {
                            ArrayList arrayListS = aVar.b().s(context3, iIntValue5, a2VarC3);
                            if (arrayListS.isEmpty()) {
                                bVarX = null;
                            } else {
                                Iterator it4 = arrayListS.iterator();
                                int i14 = 0;
                                while (it4.hasNext()) {
                                    i14 += ((e8.b) it4.next()).f39167c;
                                }
                                e8.b bVar3 = new e8.b("isAll", i14, "Recent", iIntValue5, 32, true);
                                if (a2VarC3 != null && a2VarC3.q()) {
                                    aVar.b().u(context3, bVar3);
                                }
                                bVarX = bVar3;
                            }
                        } else {
                            bVarX = aVar.b().x(context3, str12, iIntValue5, a2VarC3);
                            if (bVarX == null) {
                                bVarX = null;
                            } else if (a2VarC3 != null && a2VarC3.q()) {
                                aVar.b().u(context3, bVarX);
                            }
                        }
                        if (bVarX != null) {
                            bVar.b(k.y(j1.f.C(bVarX)));
                            return;
                        } else {
                            bVar.b(null);
                            return;
                        }
                    }
                    break;
                case 163601886:
                    if (method.equals("saveImage")) {
                        try {
                            Object objA26 = mVar.a("image");
                            kotlin.jvm.internal.n.c(objA26);
                            byte[] bArr = (byte[]) objA26;
                            Object objA27 = mVar.a("filename");
                            kotlin.jvm.internal.n.c(objA27);
                            String str13 = (String) objA27;
                            String str14 = (String) mVar.a("title");
                            String str15 = str14 == null ? "" : str14;
                            String str16 = (String) mVar.a(CampaignEx.JSON_KEY_DESC);
                            String str17 = str16 == null ? "" : str16;
                            String str18 = (String) mVar.a("relativePath");
                            bVar.b(k.w(aVar.b().c(aVar.f38758a, bArr, str13, str15, str17, str18 == null ? "" : str18, (Integer) mVar.a("orientation"), (Double) mVar.a("latitude"), (Double) mVar.a("longitude"), (Long) mVar.a("creationDate"))));
                            return;
                        } catch (Exception e15) {
                            l8.a.c("save image error", e15);
                            kotlin.jvm.internal.n.e(method, "method");
                            bVar.c(method, null, e15);
                            return;
                        }
                    }
                    break;
                case 175491326:
                    if (method.equals("saveVideo")) {
                        try {
                            Object objA28 = mVar.a("path");
                            kotlin.jvm.internal.n.c(objA28);
                            String str19 = (String) objA28;
                            Object objA29 = mVar.a("title");
                            kotlin.jvm.internal.n.c(objA29);
                            String str20 = (String) objA29;
                            String str21 = (String) mVar.a(CampaignEx.JSON_KEY_DESC);
                            String str22 = str21 == null ? "" : str21;
                            String str23 = (String) mVar.a("relativePath");
                            bVar.b(k.w(aVar.b().B(aVar.f38758a, str19, str20, str22, str23 == null ? "" : str23, (Integer) mVar.a("orientation"), (Double) mVar.a("latitude"), (Double) mVar.a("longitude"), (Long) mVar.a("creationDate"))));
                            return;
                        } catch (Exception e16) {
                            l8.a.c("save video error", e16);
                            kotlin.jvm.internal.n.e(method, "method");
                            bVar.c(method, null, e16);
                            return;
                        }
                    }
                    break;
                case 326673488:
                    if (method.equals("fetchEntityProperties")) {
                        Object objA30 = mVar.a("id");
                        kotlin.jvm.internal.n.c(objA30);
                        g8.f fVarB2 = aVar.b();
                        Context context4 = aVar.f38758a;
                        g8.e eVar2 = g8.f.f41737a;
                        e8.a aVarV = fVarB2.v(context4, (String) objA30);
                        bVar.b(aVarV != null ? k.w(aVarV) : null);
                        return;
                    }
                    break;
                case 614003350:
                    if (method.equals("updateCreationDate")) {
                        Object objA31 = mVar.a("id");
                        kotlin.jvm.internal.n.c(objA31);
                        String str24 = (String) objA31;
                        Object objA32 = mVar.a("timestamp");
                        kotlin.jvm.internal.n.c(objA32);
                        long jLongValue = ((Number) objA32).longValue();
                        aVar.getClass();
                        try {
                            g8.f fVarB3 = aVar.b();
                            Context context5 = aVar.f38758a;
                            fVarB3.getClass();
                            kotlin.jvm.internal.n.f(context5, "context");
                            ContentResolver contentResolver = context5.getContentResolver();
                            ContentValues contentValues = new ContentValues();
                            contentValues.put("datetaken", Long.valueOf(jLongValue * ((long) 1000)));
                            bVar.b(Boolean.valueOf(contentResolver.update(fVarB3.k(), contentValues, "_id = ?", new String[]{str24}) > 0));
                            return;
                        } catch (Exception e17) {
                            l8.a.b(e17);
                            bVar.b(Boolean.FALSE);
                            return;
                        }
                    }
                    break;
                case 624480877:
                    if (method.equals("getAssetsByRange")) {
                        bVar.b(k.x(aVar.b().i(aVar.f38758a, c(mVar), b(mVar, "start"), b(mVar, TtmlNode.END), b(mVar, "type"))));
                        return;
                    }
                    break;
                case 857200492:
                    if (method.equals("assetExists")) {
                        Object objA33 = mVar.a("id");
                        kotlin.jvm.internal.n.c(objA33);
                        g8.f fVarB4 = aVar.b();
                        Context context6 = aVar.f38758a;
                        fVarB4.getClass();
                        kotlin.jvm.internal.n.f(context6, "context");
                        ContentResolver contentResolver2 = context6.getContentResolver();
                        kotlin.jvm.internal.n.e(contentResolver2, "getContentResolver(...)");
                        Cursor cursorR = fVarB4.r(contentResolver2, fVarB4.k(), new String[]{"_id"}, "_id = ?", new String[]{(String) objA33}, null, false);
                        try {
                            boolean z11 = cursorR.getCount() >= 1;
                            cursorR.close();
                            bVar.b(Boolean.valueOf(z11));
                            return;
                        } catch (Throwable th2) {
                            try {
                                throw th2;
                            } catch (Throwable th3) {
                                i0.j(cursorR, th2);
                                throw th3;
                            }
                        }
                    }
                    break;
                case 972925196:
                    if (method.equals("cancelCacheRequests")) {
                        ArrayList arrayList5 = aVar.f38760c;
                        List listN0 = xj.n.N0(arrayList5);
                        arrayList5.clear();
                        Iterator it5 = listN0.iterator();
                        while (it5.hasNext()) {
                            com.bumptech.glide.b.c(aVar.f38758a).i((w6.e) it5.next());
                        }
                        bVar.b(null);
                        return;
                    }
                    break;
                case 1063055279:
                    if (method.equals("getOriginBytes")) {
                        Object objA34 = mVar.a("id");
                        kotlin.jvm.internal.n.c(objA34);
                        String str25 = (String) objA34;
                        Context context7 = aVar.f38758a;
                        g8.f fVarB5 = aVar.b();
                        g8.e eVar3 = g8.f.f41737a;
                        e8.a aVarV2 = fVarB5.v(context7, str25);
                        if (aVarV2 == null) {
                            String strConcat = "Failed to find the asset ".concat(str25);
                            Handler handler = l8.b.f45242d;
                            bVar.c("202", strConcat, null);
                            return;
                        } else {
                            try {
                                bVar.b(aVar.b().A(context7, aVarV2, z10));
                                return;
                            } catch (Exception e18) {
                                aVar.b().q(context7, str25);
                                bVar.c("202", "get originBytes error", e18);
                                return;
                            }
                        }
                    }
                    break;
                case 1150344167:
                    if (method.equals("deleteWithIds")) {
                        try {
                            Object objA35 = mVar.a("ids");
                            kotlin.jvm.internal.n.c(objA35);
                            List list6 = (List) objA35;
                            ArrayList arrayList6 = new ArrayList(p.W(list6, 10));
                            Iterator it6 = list6.iterator();
                            while (it6.hasNext()) {
                                arrayList6.add(aVar.d((String) it6.next()));
                            }
                            bVar2.a(xj.n.N0(arrayList6), bVar);
                            return;
                        } catch (Exception e19) {
                            l8.a.c("deleteWithIds failed", e19);
                            bVar.c("deleteWithIds failed", null, null);
                            return;
                        }
                    }
                    break;
                case 1177116769:
                    if (method.equals("getMediaUrl")) {
                        Object objA36 = mVar.a("id");
                        kotlin.jvm.internal.n.c(objA36);
                        Object objA37 = mVar.a("type");
                        kotlin.jvm.internal.n.c(objA37);
                        bVar.b(aVar.b().E(aVar.f38758a, ((Number) objA37).intValue(), Long.parseLong((String) objA36)));
                        return;
                    }
                    break;
                case 1342335251:
                    if (method.equals("getFileSize")) {
                        Object objA38 = mVar.a("id");
                        kotlin.jvm.internal.n.c(objA38);
                        aVar.getClass();
                        g8.f fVarB6 = aVar.b();
                        Context context8 = aVar.f38758a;
                        fVarB6.getClass();
                        kotlin.jvm.internal.n.f(context8, "context");
                        ContentResolver contentResolver3 = context8.getContentResolver();
                        kotlin.jvm.internal.n.e(contentResolver3, "getContentResolver(...)");
                        Cursor cursorR2 = fVarB6.r(contentResolver3, fVarB6.k(), new String[]{"_size"}, "_id = ?", new String[]{(String) objA38}, null, false);
                        try {
                            Cursor cursor = cursorR2;
                            if (cursor.moveToNext()) {
                                jK = com.google.android.gms.internal.auth.o.k(cursor, "_size");
                                cursorR2.close();
                            } else {
                                cursorR2.close();
                                jK = 0;
                            }
                            bVar.b(Long.valueOf(jK));
                            return;
                        } catch (Throwable th4) {
                            try {
                                throw th4;
                            } catch (Throwable th5) {
                                i0.j(cursorR2, th4);
                                throw th5;
                            }
                        }
                    }
                    break;
                case 1375013309:
                    if (method.equals("getAssetPathList")) {
                        Object objA39 = mVar.a("type");
                        kotlin.jvm.internal.n.c(objA39);
                        int iIntValue6 = ((Number) objA39).intValue();
                        Object objA40 = mVar.a("hasAll");
                        kotlin.jvm.internal.n.c(objA40);
                        boolean zBooleanValue2 = ((Boolean) objA40).booleanValue();
                        a2 a2VarC4 = c(mVar);
                        Object objA41 = mVar.a("onlyAll");
                        kotlin.jvm.internal.n.c(objA41);
                        boolean zBooleanValue3 = ((Boolean) objA41).booleanValue();
                        Context context9 = aVar.f38758a;
                        if (zBooleanValue3) {
                            arrayListB0 = aVar.b().e(context9, iIntValue6, a2VarC4);
                        } else {
                            ArrayList arrayListS2 = aVar.b().s(context9, iIntValue6, a2VarC4);
                            if (zBooleanValue2) {
                                Iterator it7 = arrayListS2.iterator();
                                int i15 = 0;
                                while (it7.hasNext()) {
                                    i15 += ((e8.b) it7.next()).f39167c;
                                }
                                arrayListB0 = xj.n.B0(arrayListS2, j1.f.C(new e8.b("isAll", i15, "Recent", iIntValue6, 32, true)));
                            } else {
                                arrayListB0 = arrayListS2;
                            }
                        }
                        bVar.b(k.y(arrayListB0));
                        return;
                    }
                    break;
                case 1477946491:
                    if (method.equals("copyAsset")) {
                        Object objA42 = mVar.a("assetId");
                        kotlin.jvm.internal.n.c(objA42);
                        String str26 = (String) objA42;
                        Object objA43 = mVar.a("galleryId");
                        kotlin.jvm.internal.n.c(objA43);
                        String str27 = (String) objA43;
                        aVar.getClass();
                        try {
                            bVar.b(k.w(aVar.b().j(aVar.f38758a, str26, str27)));
                            return;
                        } catch (Exception e20) {
                            l8.a.b(e20);
                            bVar.c("copyAsset", "Failed to copy asset " + str26 + " to gallery " + str27, e20);
                            return;
                        }
                    }
                    break;
                case 1806009333:
                    if (method.equals("getAssetCount")) {
                        a2 a2VarC5 = c(mVar);
                        int iB4 = b(mVar, "type");
                        aVar.getClass();
                        g8.f fVarB7 = aVar.b();
                        Context context10 = aVar.f38758a;
                        fVarB7.getClass();
                        kotlin.jvm.internal.n.f(context10, "context");
                        ContentResolver contentResolver4 = context10.getContentResolver();
                        ArrayList arrayList7 = new ArrayList();
                        if (a2VarC5 == null || (strJ = a2VarC5.B(iB4, arrayList7, false)) == null) {
                            strJ = j1.f.J(iB4);
                        }
                        String str28 = strJ;
                        String strE = a2VarC5 != null ? a2VarC5.E() : null;
                        kotlin.jvm.internal.n.c(contentResolver4);
                        Cursor cursorR3 = fVarB7.r(contentResolver4, fVarB7.k(), new String[]{"_id"}, str28, (String[]) arrayList7.toArray(new String[0]), strE, false);
                        try {
                            int count = cursorR3.getCount();
                            cursorR3.close();
                            bVar.b(Integer.valueOf(count));
                            return;
                        } catch (Throwable th6) {
                            try {
                                throw th6;
                            } catch (Throwable th7) {
                                i0.j(cursorR3, th6);
                                throw th7;
                            }
                        }
                    }
                    break;
                case 1966168096:
                    if (method.equals("getThumb")) {
                        Object objA44 = mVar.a("id");
                        kotlin.jvm.internal.n.c(objA44);
                        String str29 = (String) objA44;
                        Object objA45 = mVar.a("option");
                        kotlin.jvm.internal.n.c(objA45);
                        e8.d dVarP2 = q1.p((Map) objA45);
                        aVar.getClass();
                        Context context11 = aVar.f38758a;
                        int i16 = dVarP2.f39177a;
                        int i17 = dVarP2.f39178b;
                        int i18 = dVarP2.f39180d;
                        Bitmap.CompressFormat compressFormat = dVarP2.f39179c;
                        long j11 = dVarP2.f39181e;
                        try {
                            g8.f fVarB8 = aVar.b();
                            g8.e eVar4 = g8.f.f41737a;
                            e8.a aVarV3 = fVarB8.v(context11, str29);
                            if (aVarV3 == null) {
                                bVar.c("201", "Failed to find the asset ".concat(str29), null);
                            } else {
                                r9.b.m(aVar.f38758a, aVarV3, i16, i17, compressFormat, i18, j11, bVar);
                            }
                            return;
                        } catch (Exception e21) {
                            Log.e("PhotoManager", "get " + str29 + " thumbnail error, width : " + i16 + ", height: " + i17, e21);
                            aVar.b().q(context11, str29);
                            bVar.c("201", "get thumb error", e21);
                            return;
                        }
                    }
                    break;
            }
        }
        bVar.a();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // xi.n
    public final void onMethodCall(m call, xi.o oVar) {
        boolean z10;
        i8.c cVar = this.f38777c;
        Context applicationContext = this.f38775a;
        kotlin.jvm.internal.n.f(call, "call");
        final l8.b bVar = new l8.b((j) oVar, call);
        String str = call.f53822a;
        kotlin.jvm.internal.n.c(str);
        if (!xj.k.c0(new String[]{"log", "openSetting", "forceOldApi", "systemVersion", "clearFileCache", "releaseMemoryCache", "ignorePermissionCheck", "getPermissionState", "canManageMedia", "requestManageMedia"}, str)) {
            if (!xj.k.c0(new String[]{"requestPermissionExtend", "presentLimited"}, str)) {
                if (this.f38783i) {
                    final int i10 = 1;
                    f38774j.execute(new gi(new jk.a(this) { // from class: d8.e

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ f f38772b;

                        {
                            this.f38772b = this;
                        }

                        @Override // jk.a
                        public final Object invoke() {
                            int i11 = i10;
                            r rVar = r.f53297a;
                            l8.b bVar2 = bVar;
                            f fVar = this.f38772b;
                            switch (i11) {
                                case 0:
                                    a aVar = fVar.f38782h;
                                    Context context = aVar.f38758a;
                                    kotlin.jvm.internal.n.f(context, "context");
                                    com.bumptech.glide.b bVarA = com.bumptech.glide.b.a(context);
                                    bVarA.getClass();
                                    char[] cArr = a7.p.f3444a;
                                    if (Looper.myLooper() == Looper.getMainLooper()) {
                                        throw new IllegalArgumentException("You must call this method on a background thread");
                                    }
                                    bVarA.f10457a.f41654f.a().clear();
                                    aVar.b().n(context);
                                    bVar2.b(1);
                                    return rVar;
                                default:
                                    try {
                                        i8.c cVar2 = fVar.f38777c;
                                        Context applicationContext2 = fVar.f38775a;
                                        cVar2.getClass();
                                        kotlin.jvm.internal.n.f(applicationContext2, "applicationContext");
                                        fVar.d(bVar2, cVar2.f42911c.c(applicationContext2));
                                        break;
                                    } catch (Exception e10) {
                                        m mVar = bVar2.f45244b;
                                        String str2 = mVar.f53822a;
                                        bVar2.c(l1.d.g("The ", str2, " method has an error: ", e10.getMessage()), i0.m0(e10), mVar.f53823b);
                                    }
                                    return rVar;
                            }
                        }
                    }, 3));
                    return;
                } else {
                    final int i11 = 1;
                    f38774j.execute(new gi(new jk.a(this) { // from class: d8.e

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ f f38772b;

                        {
                            this.f38772b = this;
                        }

                        @Override // jk.a
                        public final Object invoke() {
                            int i12 = i11;
                            r rVar = r.f53297a;
                            l8.b bVar2 = bVar;
                            f fVar = this.f38772b;
                            switch (i12) {
                                case 0:
                                    a aVar = fVar.f38782h;
                                    Context context = aVar.f38758a;
                                    kotlin.jvm.internal.n.f(context, "context");
                                    com.bumptech.glide.b bVarA = com.bumptech.glide.b.a(context);
                                    bVarA.getClass();
                                    char[] cArr = a7.p.f3444a;
                                    if (Looper.myLooper() == Looper.getMainLooper()) {
                                        throw new IllegalArgumentException("You must call this method on a background thread");
                                    }
                                    bVarA.f10457a.f41654f.a().clear();
                                    aVar.b().n(context);
                                    bVar2.b(1);
                                    return rVar;
                                default:
                                    try {
                                        i8.c cVar2 = fVar.f38777c;
                                        Context applicationContext2 = fVar.f38775a;
                                        cVar2.getClass();
                                        kotlin.jvm.internal.n.f(applicationContext2, "applicationContext");
                                        fVar.d(bVar2, cVar2.f42911c.c(applicationContext2));
                                        break;
                                    } catch (Exception e10) {
                                        m mVar = bVar2.f45244b;
                                        String str2 = mVar.f53822a;
                                        bVar2.c(l1.d.g("The ", str2, " method has an error: ", e10.getMessage()), i0.m0(e10), mVar.f53823b);
                                    }
                                    return rVar;
                            }
                        }
                    }, 3));
                    return;
                }
            }
            if (!str.equals("requestPermissionExtend")) {
                if (str.equals("presentLimited")) {
                    Object objA = call.a("type");
                    kotlin.jvm.internal.n.c(objA);
                    int iIntValue = ((Number) objA).intValue();
                    cVar.getClass();
                    i8.a aVar = cVar.f42911c;
                    Application application = cVar.f42910b;
                    kotlin.jvm.internal.n.c(application);
                    aVar.g(cVar, application, iIntValue, bVar);
                    return;
                }
                return;
            }
            Object objA2 = call.a("androidPermission");
            kotlin.jvm.internal.n.c(objA2);
            Map map = (Map) objA2;
            Object obj = map.get("type");
            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.Int");
            int iIntValue2 = ((Integer) obj).intValue();
            Object obj2 = map.get("mediaLocation");
            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.Boolean");
            boolean zBooleanValue = ((Boolean) obj2).booleanValue();
            Activity activity = this.f38776b;
            cVar.f42909a = activity;
            cVar.f42910b = activity != null ? activity.getApplication() : null;
            cVar.f42915g = new b2.p(bVar, this, iIntValue2, zBooleanValue);
            kotlin.jvm.internal.n.f(applicationContext, "applicationContext");
            cVar.f42911c.h(cVar, applicationContext, iIntValue2, zBooleanValue);
            return;
        }
        switch (str) {
            case "getPermissionState":
                Object objA3 = call.a("androidPermission");
                kotlin.jvm.internal.n.c(objA3);
                Map map2 = (Map) objA3;
                Object obj3 = map2.get("type");
                kotlin.jvm.internal.n.d(obj3, "null cannot be cast to non-null type kotlin.Int");
                int iIntValue3 = ((Integer) obj3).intValue();
                Object obj4 = map2.get("mediaLocation");
                kotlin.jvm.internal.n.d(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                i8.a aVar2 = cVar.f42911c;
                Application application2 = cVar.f42910b;
                kotlin.jvm.internal.n.c(application2);
                bVar.b(Integer.valueOf(aVar2.a(application2, iIntValue3).f39176a));
                return;
            case "systemVersion":
                bVar.b(String.valueOf(Build.VERSION.SDK_INT));
                return;
            case "forceOldApi":
                this.f38782h.f38759b = true;
                bVar.b(1);
                return;
            case "log":
                Boolean bool = (Boolean) call.f53823b;
                l8.a.f45241b = bool != null ? bool.booleanValue() : false;
                bVar.b(1);
                return;
            case "requestManageMedia":
                cVar.getClass();
                kotlin.jvm.internal.n.f(applicationContext, "applicationContext");
                if (Build.VERSION.SDK_INT < 31) {
                    z10 = false;
                } else {
                    Intent intent = new Intent("android.settings.REQUEST_MANAGE_MEDIA");
                    intent.setData(Uri.fromParts("package", applicationContext.getPackageName(), null));
                    intent.addFlags(268435456);
                    Activity activity2 = cVar.f42909a;
                    if (activity2 != null) {
                        applicationContext = activity2;
                    }
                    try {
                        applicationContext.startActivity(intent);
                        z10 = true;
                    } catch (Exception e10) {
                        l8.a.c("Failed to launch ACTION_REQUEST_MANAGE_MEDIA", e10);
                        z10 = false;
                    }
                }
                bVar.b(Boolean.valueOf(z10));
                return;
            case "ignorePermissionCheck":
                Object objA4 = call.a("ignore");
                kotlin.jvm.internal.n.c(objA4);
                Boolean bool2 = (Boolean) objA4;
                this.f38783i = bool2.booleanValue();
                bVar.b(bool2);
                return;
            case "clearFileCache":
                com.bumptech.glide.b bVarA = com.bumptech.glide.b.a(applicationContext);
                bVarA.getClass();
                a7.p.a();
                bVarA.f10459c.f(0L);
                bVarA.f10458b.k();
                dm0 dm0Var = bVarA.f10461e;
                synchronized (dm0Var) {
                    dm0Var.c(0);
                }
                final int i12 = 0;
                f38774j.execute(new gi(new jk.a(this) { // from class: d8.e

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ f f38772b;

                    {
                        this.f38772b = this;
                    }

                    @Override // jk.a
                    public final Object invoke() {
                        int i13 = i12;
                        r rVar = r.f53297a;
                        l8.b bVar2 = bVar;
                        f fVar = this.f38772b;
                        switch (i13) {
                            case 0:
                                a aVar3 = fVar.f38782h;
                                Context context = aVar3.f38758a;
                                kotlin.jvm.internal.n.f(context, "context");
                                com.bumptech.glide.b bVarA2 = com.bumptech.glide.b.a(context);
                                bVarA2.getClass();
                                char[] cArr = a7.p.f3444a;
                                if (Looper.myLooper() == Looper.getMainLooper()) {
                                    throw new IllegalArgumentException("You must call this method on a background thread");
                                }
                                bVarA2.f10457a.f41654f.a().clear();
                                aVar3.b().n(context);
                                bVar2.b(1);
                                return rVar;
                            default:
                                try {
                                    i8.c cVar2 = fVar.f38777c;
                                    Context applicationContext2 = fVar.f38775a;
                                    cVar2.getClass();
                                    kotlin.jvm.internal.n.f(applicationContext2, "applicationContext");
                                    fVar.d(bVar2, cVar2.f42911c.c(applicationContext2));
                                    break;
                                } catch (Exception e11) {
                                    m mVar = bVar2.f45244b;
                                    String str2 = mVar.f53822a;
                                    bVar2.c(l1.d.g("The ", str2, " method has an error: ", e11.getMessage()), i0.m0(e11), mVar.f53823b);
                                }
                                return rVar;
                        }
                    }
                }, 3));
                return;
            case "canManageMedia":
                cVar.getClass();
                bVar.b(Boolean.valueOf(i8.c.a(applicationContext)));
                return;
            case "openSetting":
                Activity activity3 = this.f38776b;
                cVar.getClass();
                Intent intent2 = new Intent();
                intent2.addFlags(268435456);
                intent2.addFlags(1073741824);
                intent2.addFlags(8388608);
                intent2.addCategory("android.intent.category.DEFAULT");
                intent2.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
                kotlin.jvm.internal.n.c(activity3);
                intent2.setData(Uri.fromParts("package", activity3.getPackageName(), null));
                activity3.startActivity(intent2);
                bVar.b(1);
                return;
            case "releaseMemoryCache":
                bVar.b(1);
                return;
            default:
                return;
        }
    }
}
