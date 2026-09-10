package k7;

import an.h;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.util.Log;
import com.google.android.gms.common.api.internal.t;
import com.google.android.gms.internal.ads.ur1;
import com.ironsource.X3;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import d5.u;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import hk.k;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Future;
import kg.c;
import kg.d;
import kg.e;
import kotlin.Metadata;
import ti.b;
import wi.j;
import wj.r;
import xi.f;
import xi.m;
import xi.n;
import xi.o;
import xi.p;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lk7/a;", "Lxi/n;", "Lti/b;", "<init>", "()V", "video_compress_release"}, k = 1, mv = {2, 2, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class a implements n, b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f44394a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public p f44395b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Future f44396c;

    @Override // ti.b
    public final void onAttachedToEngine(ti.a binding) {
        kotlin.jvm.internal.n.f(binding, "binding");
        Context context = binding.f50787a;
        kotlin.jvm.internal.n.e(context, "getApplicationContext(...)");
        f fVar = binding.f50789c;
        kotlin.jvm.internal.n.e(fVar, "getBinaryMessenger(...)");
        p pVar = new p(fVar, "video_compress");
        pVar.b(this);
        this.f44394a = context;
        this.f44395b = pVar;
    }

    @Override // ti.b
    public final void onDetachedFromEngine(ti.a binding) {
        kotlin.jvm.internal.n.f(binding, "binding");
        p pVar = this.f44395b;
        if (pVar != null) {
            pVar.b(null);
        }
        this.f44394a = null;
        this.f44395b = null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // xi.n
    public final void onMethodCall(m call, o oVar) throws IOException {
        d dVar;
        e eVar;
        jg.b dVar2;
        kg.a aVar;
        kotlin.jvm.internal.n.f(call, "call");
        Context context = this.f44394a;
        p pVar = this.f44395b;
        if (context == null || pVar == null) {
            Log.w("VideoCompressPlugin", "Calling VideoCompress plugin before initialization");
            return;
        }
        String str = call.f53822a;
        if (str != null) {
            switch (str.hashCode()) {
                case -1335238004:
                    if (str.equals("cancelCompression")) {
                        Future future = this.f44396c;
                        if (future != null) {
                            future.cancel(true);
                        }
                        ((j) oVar).a(Boolean.FALSE);
                        return;
                    }
                    break;
                case -442064102:
                    if (str.equals("getFileThumbnail")) {
                        String str2 = (String) call.a("path");
                        Object objA = call.a("quality");
                        kotlin.jvm.internal.n.c(objA);
                        int iIntValue = ((Number) objA).intValue();
                        Object objA2 = call.a(X3.i.L);
                        kotlin.jvm.internal.n.c(objA2);
                        int iIntValue2 = ((Number) objA2).intValue();
                        j2.n nVar = new j2.n(4);
                        kotlin.jvm.internal.n.c(str2);
                        j jVar = (j) oVar;
                        Bitmap bitmapS = nVar.s(str2, iIntValue2, jVar);
                        File externalFilesDir = context.getExternalFilesDir("video_compress");
                        if (externalFilesDir != null && !externalFilesDir.exists()) {
                            externalFilesDir.mkdirs();
                        }
                        String strSubstring = str2.substring(h.B0(str2, '/', 0, 6), h.B0(str2, '.', 0, 6));
                        kotlin.jvm.internal.n.e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                        File file = new File(externalFilesDir, strSubstring.concat(".jpg"));
                        if (file.exists()) {
                            file.delete();
                        }
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        bitmapS.compress(Bitmap.CompressFormat.JPEG, iIntValue, byteArrayOutputStream);
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        try {
                            file.createNewFile();
                            kotlin.jvm.internal.n.c(byteArray);
                            k.W(file, byteArray);
                            break;
                        } catch (IOException e10) {
                            e10.printStackTrace();
                        }
                        bitmapS.recycle();
                        jVar.a(file.getAbsolutePath());
                        return;
                    }
                    break;
                case -309915358:
                    if (str.equals("setLogLevel")) {
                        Object objA3 = call.a("logLevel");
                        kotlin.jvm.internal.n.c(objA3);
                        ec.a.f40023c = ((Number) objA3).intValue();
                        ((j) oVar).a(Boolean.TRUE);
                        return;
                    }
                    break;
                case -281136852:
                    if (str.equals("deleteAllCache")) {
                        File externalFilesDir2 = context.getExternalFilesDir("video_compress");
                        j jVar2 = (j) oVar;
                        jVar2.a(externalFilesDir2 != null ? Boolean.valueOf(k.U(externalFilesDir2)) : null);
                        jVar2.a(r.f53297a);
                        return;
                    }
                    break;
                case 1306162446:
                    if (str.equals("getByteThumbnail")) {
                        String str3 = (String) call.a("path");
                        Object objA4 = call.a("quality");
                        kotlin.jvm.internal.n.c(objA4);
                        int iIntValue3 = ((Number) objA4).intValue();
                        Object objA5 = call.a(X3.i.L);
                        kotlin.jvm.internal.n.c(objA5);
                        int iIntValue4 = ((Number) objA5).intValue();
                        j2.n nVar2 = new j2.n(4);
                        kotlin.jvm.internal.n.c(str3);
                        long j10 = iIntValue4;
                        j jVar3 = (j) oVar;
                        Bitmap bitmapS2 = nVar2.s(str3, j10, jVar3);
                        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                        bitmapS2.compress(Bitmap.CompressFormat.JPEG, iIntValue3, byteArrayOutputStream2);
                        byte[] byteArray2 = byteArrayOutputStream2.toByteArray();
                        bitmapS2.recycle();
                        kotlin.jvm.internal.n.c(byteArray2);
                        List listB0 = xj.k.B0(byteArray2);
                        byte[] bArr = new byte[listB0.size()];
                        Iterator it = listB0.iterator();
                        int i10 = 0;
                        while (it.hasNext()) {
                            bArr[i10] = ((Number) it.next()).byteValue();
                            i10++;
                        }
                        jVar3.a(bArr);
                        return;
                    }
                    break;
                case 1729824313:
                    if (str.equals("compressVideo")) {
                        Object objA6 = call.a("path");
                        kotlin.jvm.internal.n.c(objA6);
                        String str4 = (String) objA6;
                        Object objA7 = call.a("quality");
                        kotlin.jvm.internal.n.c(objA7);
                        int iIntValue5 = ((Number) objA7).intValue();
                        Object objA8 = call.a("deleteOrigin");
                        kotlin.jvm.internal.n.c(objA8);
                        boolean zBooleanValue = ((Boolean) objA8).booleanValue();
                        Integer num = (Integer) call.a("startTime");
                        Integer num2 = (Integer) call.a(IronSourceConstants.EVENTS_DURATION);
                        Boolean bool = (Boolean) call.a("includeAudio");
                        boolean zBooleanValue2 = bool != null ? bool.booleanValue() : true;
                        Integer num3 = call.a("frameRate") == null ? 30 : (Integer) call.a("frameRate");
                        File externalFilesDir3 = context.getExternalFilesDir("video_compress");
                        kotlin.jvm.internal.n.c(externalFilesDir3);
                        String absolutePath = externalFilesDir3.getAbsolutePath();
                        kotlin.jvm.internal.n.e(absolutePath, "getAbsolutePath(...)");
                        String str5 = new SimpleDateFormat("yyyy-MM-dd hh-mm-ss").format(new Date());
                        StringBuilder sbI = u.i(absolutePath);
                        sbI.append(File.separator);
                        sbI.append("VID_");
                        sbI.append(str5);
                        sbI.append(str4.hashCode());
                        sbI.append(".mp4");
                        String string = sbI.toString();
                        ec.a aVar2 = c.f44629b;
                        hg.a aVar3 = new hg.a(340);
                        hg.b bVar = new hg.b(1);
                        ((ArrayList) bVar.f42349b).add(aVar3);
                        kg.b bVar2 = new kg.b();
                        bVar2.f44624a = bVar;
                        bVar2.f44626c = 30;
                        bVar2.f44625b = Long.MIN_VALUE;
                        bVar2.f44627d = 3.0f;
                        bVar2.f44628e = "video/avc";
                        c cVar = new c(bVar2);
                        switch (iIntValue5) {
                            case 0:
                                hg.a aVar4 = new hg.a(720);
                                hg.b bVar3 = new hg.b(1);
                                ((ArrayList) bVar3.f42349b).add(aVar4);
                                kg.b bVar4 = new kg.b();
                                bVar4.f44624a = bVar3;
                                bVar4.f44626c = 30;
                                bVar4.f44625b = Long.MIN_VALUE;
                                bVar4.f44627d = 3.0f;
                                bVar4.f44628e = "video/avc";
                                cVar = new c(bVar4);
                                break;
                            case 1:
                                hg.a aVar5 = new hg.a(360);
                                hg.b bVar5 = new hg.b(1);
                                ((ArrayList) bVar5.f42349b).add(aVar5);
                                kg.b bVar6 = new kg.b();
                                bVar6.f44624a = bVar5;
                                bVar6.f44626c = 30;
                                bVar6.f44625b = Long.MIN_VALUE;
                                bVar6.f44627d = 3.0f;
                                bVar6.f44628e = "video/avc";
                                cVar = new c(bVar6);
                                break;
                            case 2:
                                hg.a aVar6 = new hg.a(640);
                                hg.b bVar7 = new hg.b(1);
                                ((ArrayList) bVar7.f42349b).add(aVar6);
                                kg.b bVar8 = new kg.b();
                                bVar8.f44624a = bVar7;
                                bVar8.f44626c = 30;
                                bVar8.f44625b = Long.MIN_VALUE;
                                bVar8.f44627d = 3.0f;
                                bVar8.f44628e = "video/avc";
                                cVar = new c(bVar8);
                                break;
                            case 3:
                                hg.b bVar9 = new hg.b(1);
                                kotlin.jvm.internal.n.c(num3);
                                int iIntValue6 = num3.intValue();
                                kg.b bVar10 = new kg.b();
                                bVar10.f44624a = bVar9;
                                bVar10.f44626c = iIntValue6;
                                bVar10.f44625b = 3686400L;
                                bVar10.f44627d = 3.0f;
                                bVar10.f44628e = "video/avc";
                                cVar = new c(bVar10);
                                break;
                            case 4:
                                hg.a aVar7 = new hg.a(480, 640);
                                hg.b bVar11 = new hg.b(1);
                                ((ArrayList) bVar11.f42349b).add(aVar7);
                                kg.b bVar12 = new kg.b();
                                bVar12.f44624a = bVar11;
                                bVar12.f44626c = 30;
                                bVar12.f44625b = Long.MIN_VALUE;
                                bVar12.f44627d = 3.0f;
                                bVar12.f44628e = "video/avc";
                                cVar = new c(bVar12);
                                break;
                            case 5:
                                hg.a aVar8 = new hg.a(540, 960);
                                hg.b bVar13 = new hg.b(1);
                                ((ArrayList) bVar13.f42349b).add(aVar8);
                                kg.b bVar14 = new kg.b();
                                bVar14.f44624a = bVar13;
                                bVar14.f44626c = 30;
                                bVar14.f44625b = Long.MIN_VALUE;
                                bVar14.f44627d = 3.0f;
                                bVar14.f44628e = "video/avc";
                                cVar = new c(bVar14);
                                break;
                            case 6:
                                hg.a aVar9 = new hg.a(720, 1280);
                                hg.b bVar15 = new hg.b(1);
                                ((ArrayList) bVar15.f42349b).add(aVar9);
                                kg.b bVar16 = new kg.b();
                                bVar16.f44624a = bVar15;
                                bVar16.f44626c = 30;
                                bVar16.f44625b = Long.MIN_VALUE;
                                bVar16.f44627d = 3.0f;
                                bVar16.f44628e = "video/avc";
                                cVar = new c(bVar16);
                                break;
                            case 7:
                                hg.a aVar10 = new hg.a(1080, 1920);
                                hg.b bVar17 = new hg.b(1);
                                ((ArrayList) bVar17.f42349b).add(aVar10);
                                kg.b bVar18 = new kg.b();
                                bVar18.f44624a = bVar17;
                                bVar18.f44626c = 30;
                                bVar18.f44625b = Long.MIN_VALUE;
                                bVar18.f44627d = 3.0f;
                                bVar18.f44628e = "video/avc";
                                cVar = new c(bVar18);
                                break;
                        }
                        if (zBooleanValue2) {
                            ur1 ur1Var = new ur1();
                            ur1Var.f20874a = -1;
                            ur1Var.f20877d = -1;
                            ur1Var.f20876c = MimeTypes.AUDIO_AAC;
                            ur1Var.f20875b = Long.MIN_VALUE;
                            aVar = new kg.a();
                            aVar.f44623a = ur1Var;
                        } else {
                            dVar = new d();
                        }
                        if (num == null && num2 == null) {
                            dVar2 = new jg.e(context, Uri.parse(str4));
                        } else {
                            eVar = dVar;
                            eVar = aVar;
                            dVar2 = new jg.d(new jg.e(context, Uri.parse(str4)), (num != null ? num.intValue() : 0) * 1000000, (num2 != null ? num2.intValue() : 0) * 1000000);
                        }
                        kotlin.jvm.internal.n.c(string);
                        uf.b bVar19 = new uf.b(string);
                        bVar19.f52199b.add(dVar2);
                        bVar19.f52200c.add(dVar2);
                        bVar19.f52201d = eVar;
                        bVar19.f52202e = cVar;
                        bVar19.f52207j = new t(pVar, this, context, string, (j) oVar, zBooleanValue, str4);
                        this.f44396c = bVar19.a();
                        return;
                    }
                    break;
                case 2130520060:
                    if (str.equals("getMediaInfo")) {
                        String str6 = (String) call.a("path");
                        kotlin.jvm.internal.n.c(str6);
                        ((j) oVar).a(j2.n.w(context, str6).toString());
                        return;
                    }
                    break;
            }
        }
        ((j) oVar).c();
    }
}
