package eradication;

import android.text.TextUtils;
import android.util.Base64;
import com.inmobi.media.core.config.models.CrashConfig;
import com.ironsource.C3460cc;
import com.yolo.networklibrary.common.util.competently;
import com.yolo.networklibrary.common.util.cutely;
import duvetyn.wireman;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import okhttp3.adultoid;
import okhttp3.cord;
import okhttp3.cuirassed;
import okhttp3.dovishness;
import okhttp3.logging.HttpLoggingInterceptor;
import okhttp3.preprohormone;
import okhttp3.rotuma;
import okhttp3.stratoscope;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BaseYoloEncryptHttpUtil.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0007\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH&¢\u0006\u0004\b\r\u0010\fJ!\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\nH&¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0013\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0010H&¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0015\u0010\fR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0016R\u0016\u0010\u001a\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001c\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u0016\u0010\u001d\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0019¨\u0006\u001e"}, d2 = {"Leradication/attabal;", "Lshapoo/saneness;", "<init>", "()V", "Lokhttp3/rotuma$attabal;", "attabal", "()Lokhttp3/rotuma$attabal;", "builder", "taiyuan", "(Lokhttp3/rotuma$attabal;)Lokhttp3/rotuma$attabal;", "", "getKey", "()Ljava/lang/String;", "impromptu", "iv", "data", "", "marial", "(Ljava/lang/String;Ljava/lang/String;)[B", "wireman", "(Ljava/lang/String;[B)Ljava/lang/String;", "competently", "Lokhttp3/rotuma$attabal;", "", "saneness", "J", "connectTimeoutMilliseconds", "dern", "readTimeoutMilliseconds", "writeTimeoutMilliseconds", "neworklibrary_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class attabal implements shapoo.saneness {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public rotuma.attabal builder;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public long connectTimeoutMilliseconds = 15000;

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public long readTimeoutMilliseconds = CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
    public long writeTimeoutMilliseconds = CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL;

    /* JADX INFO: renamed from: eradication.attabal$attabal, reason: collision with other inner class name */
    /* JADX INFO: compiled from: OkHttpClient.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lokhttp3/adultoid$attabal;", "chain", "Lokhttp3/cuirassed;", "intercept", "(Lokhttp3/adultoid$attabal;)Lokhttp3/cuirassed;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class C0601attabal implements adultoid {
        public C0601attabal() {
        }

        @Override // okhttp3.adultoid
        public final cuirassed intercept(adultoid.attabal chain) throws IOException {
            stratoscope body;
            dovishness f34158attabal;
            Intrinsics.checkNotNullParameter(chain, "chain");
            preprohormone preprohormoneVarRequest = chain.request();
            cord body2 = preprohormoneVarRequest.getBody();
            preprohormone.attabal attabalVarTaiyuan = preprohormoneVarRequest.taiyuan();
            String requestIv = cutely.wireman(16);
            if (Intrinsics.wireman(preprohormoneVarRequest.getMethod(), C3460cc.b) && body2 != null && (f34158attabal = body2.getF34158attabal()) != null) {
                competently competentlyVar = competently.f23963attabal;
                if (f34158attabal.equals(competentlyVar.attabal())) {
                    wireman wiremanVar = new wireman();
                    body2.writeTo(wiremanVar);
                    String strUtf8 = wiremanVar.readByteString().utf8();
                    attabal attabalVar = attabal.this;
                    Intrinsics.checkNotNullExpressionValue(requestIv, "requestIv");
                    String bodyStr = Base64.encodeToString(attabalVar.marial(requestIv, strUtf8), 0);
                    String strAttabal = regie.attabal.attabal(bodyStr, attabal.this.competently());
                    if (strAttabal == null) {
                        strAttabal = "";
                    }
                    Intrinsics.checkNotNullExpressionValue(strAttabal, "HmacMD5.encode(\n        …                  ) ?: \"\"");
                    if (!TextUtils.isEmpty(strAttabal)) {
                        attabalVarTaiyuan.attabal("Authorization", strAttabal);
                    }
                    cord.Companion companion = cord.INSTANCE;
                    Intrinsics.checkNotNullExpressionValue(bodyStr, "bodyStr");
                    attabalVarTaiyuan.apical(companion.saneness(bodyStr, competentlyVar.attabal()));
                }
            }
            Intrinsics.checkNotNullExpressionValue(requestIv, "requestIv");
            attabalVarTaiyuan.attabal("X-Yolo-Auth", requestIv);
            attabalVarTaiyuan.attabal("x-token", attabal.this.impromptu());
            cuirassed cuirassedVarAttabal = chain.attabal(attabalVarTaiyuan.saneness());
            String strRotuma = cuirassed.rotuma(cuirassedVarAttabal, "X-Yolo-Auth", null, 2, null);
            if (strRotuma == null) {
                strRotuma = "";
            }
            if (TextUtils.isEmpty(strRotuma) || (body = cuirassedVarAttabal.getBody()) == null) {
                return cuirassedVarAttabal;
            }
            String strWireman = attabal.this.wireman(strRotuma, body.bytes());
            return cuirassedVarAttabal.polder().saneness(stratoscope.INSTANCE.saneness(strWireman != null ? strWireman : "", body.getF34696kowloon())).dern();
        }
    }

    /* JADX INFO: compiled from: BaseYoloEncryptHttpUtil.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"eradication/attabal$saneness", "Lgynocracy/attabal;", "", "initVector", "", "encrypted", "saneness", "(Ljava/lang/String;[B)Ljava/lang/String;", "neworklibrary_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class saneness extends gynocracy.attabal {
        public saneness() {
        }

        @Override // gynocracy.attabal
        public String saneness(String initVector, byte[] encrypted) {
            Intrinsics.checkNotNullParameter(initVector, "initVector");
            Intrinsics.checkNotNullParameter(encrypted, "encrypted");
            String strWireman = attabal.this.wireman(initVector, encrypted);
            return strWireman == null ? "" : strWireman;
        }
    }

    @Override // shapoo.saneness
    public final rotuma.attabal attabal() {
        rotuma.attabal attabalVarSaneness = this.builder;
        if (attabalVarSaneness == null) {
            rotuma.attabal attabalVar = new rotuma.attabal();
            long j = this.connectTimeoutMilliseconds;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            attabalVarSaneness = irreclaimable.attabal.saneness(attabalVar.beachfront(j, timeUnit).hydrovane(this.readTimeoutMilliseconds, timeUnit).lerp(this.writeTimeoutMilliseconds, timeUnit).attabal(new C0601attabal()).attabal(new HttpLoggingInterceptor(new saneness()).wireman(HttpLoggingInterceptor.Level.BODY)));
        }
        this.builder = taiyuan(attabalVarSaneness);
        return attabalVarSaneness;
    }

    public <T> T beachfront(Class<T> cls, String... strArr) {
        return (T) shapoo.saneness.attabal.attabal(this, cls, strArr);
    }

    public final String competently() {
        return revolt.attabal.f36720attabal.dern().getHmacMd5Key();
    }

    @Override // shapoo.saneness
    public final String getKey() {
        return "yolo_http_key";
    }

    public abstract String impromptu();

    public abstract byte[] marial(String iv, String data);

    public rotuma.attabal taiyuan(rotuma.attabal builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        return builder;
    }

    public abstract String wireman(String iv, byte[] data);
}
