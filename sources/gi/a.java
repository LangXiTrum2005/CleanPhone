package gi;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import kotlin.Metadata;
import ti.b;
import wi.j;
import xi.m;
import xi.n;
import xi.o;
import xi.p;
import xj.k;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lgi/a;", "Lxi/n;", "Lti/b;", "<init>", "()V", "package_info_plus_release"}, k = 1, mv = {2, 2, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class a implements n, b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f41910a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public p f41911b;

    public static String b(byte[] bArr) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        messageDigest.update(bArr);
        byte[] bArrDigest = messageDigest.digest();
        kotlin.jvm.internal.n.c(bArrDigest);
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        char[] cArr2 = new char[bArrDigest.length * 2];
        int length = bArrDigest.length;
        for (int i10 = 0; i10 < length; i10++) {
            byte b10 = bArrDigest[i10];
            int i11 = i10 * 2;
            cArr2[i11] = cArr[(b10 & 255) >>> 4];
            cArr2[i11 + 1] = cArr[b10 & 15];
        }
        return new String(cArr2);
    }

    public final String a(PackageManager packageManager) {
        try {
            Context context = this.f41910a;
            kotlin.jvm.internal.n.c(context);
            SigningInfo signingInfo = packageManager.getPackageInfo(context.getPackageName(), 134217728).signingInfo;
            if (signingInfo == null) {
                return null;
            }
            if (signingInfo.hasMultipleSigners()) {
                Signature[] apkContentsSigners = signingInfo.getApkContentsSigners();
                kotlin.jvm.internal.n.e(apkContentsSigners, "getApkContentsSigners(...)");
                byte[] byteArray = ((Signature) k.o0(apkContentsSigners)).toByteArray();
                kotlin.jvm.internal.n.e(byteArray, "toByteArray(...)");
                return b(byteArray);
            }
            Signature[] signingCertificateHistory = signingInfo.getSigningCertificateHistory();
            kotlin.jvm.internal.n.e(signingCertificateHistory, "getSigningCertificateHistory(...)");
            byte[] byteArray2 = ((Signature) k.o0(signingCertificateHistory)).toByteArray();
            kotlin.jvm.internal.n.e(byteArray2, "toByteArray(...)");
            return b(byteArray2);
        } catch (PackageManager.NameNotFoundException | NoSuchAlgorithmException unused) {
            return null;
        }
    }

    @Override // ti.b
    public final void onAttachedToEngine(ti.a binding) {
        kotlin.jvm.internal.n.f(binding, "binding");
        this.f41910a = binding.f50787a;
        p pVar = new p(binding.f50789c, "dev.fluttercommunity.plus/package_info");
        this.f41911b = pVar;
        pVar.b(this);
    }

    @Override // ti.b
    public final void onDetachedFromEngine(ti.a binding) {
        kotlin.jvm.internal.n.f(binding, "binding");
        this.f41910a = null;
        p pVar = this.f41911b;
        kotlin.jvm.internal.n.c(pVar);
        pVar.b(null);
        this.f41911b = null;
    }

    @Override // xi.n
    public final void onMethodCall(m call, o oVar) {
        String string;
        CharSequence charSequenceLoadLabel;
        kotlin.jvm.internal.n.f(call, "call");
        try {
            if (!kotlin.jvm.internal.n.a(call.f53822a, "getAll")) {
                ((j) oVar).c();
                return;
            }
            Context context = this.f41910a;
            kotlin.jvm.internal.n.c(context);
            PackageManager packageManager = context.getPackageManager();
            Context context2 = this.f41910a;
            kotlin.jvm.internal.n.c(context2);
            PackageInfo packageInfo = packageManager.getPackageInfo(context2.getPackageName(), 0);
            String strA = a(packageManager);
            Context context3 = this.f41910a;
            kotlin.jvm.internal.n.c(context3);
            PackageManager packageManager2 = context3.getPackageManager();
            Context context4 = this.f41910a;
            kotlin.jvm.internal.n.c(context4);
            String initiatingPackageName = packageManager2.getInstallSourceInfo(context4.getPackageName()).getInitiatingPackageName();
            long j10 = packageInfo.firstInstallTime;
            long j11 = packageInfo.lastUpdateTime;
            HashMap map = new HashMap();
            ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            String str = "";
            if (applicationInfo == null || (charSequenceLoadLabel = applicationInfo.loadLabel(packageManager)) == null || (string = charSequenceLoadLabel.toString()) == null) {
                string = "";
            }
            map.put("appName", string);
            Context context5 = this.f41910a;
            kotlin.jvm.internal.n.c(context5);
            map.put("packageName", context5.getPackageName());
            String str2 = packageInfo.versionName;
            if (str2 != null) {
                str = str2;
            }
            map.put("version", str);
            map.put("buildNumber", String.valueOf(packageInfo.getLongVersionCode()));
            if (strA != null) {
                map.put("buildSignature", strA);
            }
            if (initiatingPackageName != null) {
                map.put("installerStore", initiatingPackageName);
            }
            map.put("installTime", String.valueOf(j10));
            map.put("updateTime", String.valueOf(j11));
            ((j) oVar).a(map);
        } catch (PackageManager.NameNotFoundException e10) {
            ((j) oVar).b("Name not found", e10.getMessage(), null);
        }
    }
}
