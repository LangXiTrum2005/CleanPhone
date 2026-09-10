package revolt;

import android.app.Application;
import android.content.Context;
import com.ironsource.X3;
import com.yolo.networklibrary.common.model.HttpConfigModel;
import com.yolo.networklibrary.common.model.HttpYoloConfigModel;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: HttpConfigManager.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010%\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\rJ\u0015\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u000f¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u000f¢\u0006\u0004\b\u0015\u0010\u0014J\u0015\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001d\u0010\u001eJ!\u0010 \u001a\u00020\u001c2\u0006\u0010\u0019\u001a\u00020\u00182\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b \u0010!R\u0014\u0010#\u001a\u00020\u000f8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0015\u0010\"R\u001c\u0010&\u001a\n $*\u0004\u0018\u00010\u00040\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010%R\"\u0010-\u001a\u00020'8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\"\u00103\u001a\u00020\u00188\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\f\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\"\u00109\u001a\u00020\u00078\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0016\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R#\u0010>\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000b0:8\u0006¢\u0006\f\n\u0004\b\u0011\u0010;\u001a\u0004\b<\u0010=¨\u0006?"}, d2 = {"Lrevolt/attabal;", "", "<init>", "()V", "Ljava/util/concurrent/ExecutorService;", "cutely", "()Ljava/util/concurrent/ExecutorService;", "Landroid/app/Application;", "application", "attabal", "(Landroid/app/Application;)Lrevolt/attabal;", "Lcom/yolo/networklibrary/common/model/HttpConfigModel;", "marial", "()Lcom/yolo/networklibrary/common/model/HttpConfigModel;", "dern", "", X3.i.W, "competently", "(Ljava/lang/String;)Lcom/yolo/networklibrary/common/model/HttpConfigModel;", "wireman", "()Ljava/lang/String;", "saneness", "beachfront", "(Ljava/lang/String;)Ljava/lang/String;", "Landroid/content/Context;", "context", "Lcom/yolo/networklibrary/common/model/HttpYoloConfigModel;", "httpYoloConfigModel", "", "apical", "(Landroid/content/Context;Lcom/yolo/networklibrary/common/model/HttpYoloConfigModel;)V", "assertName", "formularize", "(Landroid/content/Context;Ljava/lang/String;)V", "Ljava/lang/String;", "TAG", "kotlin.jvm.PlatformType", "Ljava/util/concurrent/ExecutorService;", "mSingleThreadExecutor", "", "Z", "impromptu", "()Z", "setIS_DEBUG", "(Z)V", "IS_DEBUG", "Landroid/content/Context;", "getMContext", "()Landroid/content/Context;", "kowloon", "(Landroid/content/Context;)V", "mContext", "Landroid/app/Application;", "getMApplication", "()Landroid/app/Application;", "triweekly", "(Landroid/app/Application;)V", "mApplication", "", "Ljava/util/Map;", "taiyuan", "()Ljava/util/Map;", "mHttpConfigMap", "neworklibrary_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class attabal {

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name and from kotlin metadata */
    public static Application mApplication;

    /* JADX INFO: renamed from: marial, reason: collision with root package name and from kotlin metadata */
    public static Context mContext;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
    public static boolean IS_DEBUG;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final attabal f36720attabal = new attabal();

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public static final String TAG = "HttpConfigManager";

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public static final ExecutorService mSingleThreadExecutor = Executors.newSingleThreadExecutor();

    /* JADX INFO: renamed from: competently, reason: collision with root package name and from kotlin metadata */
    public static final Map<String, HttpConfigModel> mHttpConfigMap = new LinkedHashMap();

    public static /* synthetic */ void impassible(attabal attabalVar, Context context, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        attabalVar.formularize(context, str);
    }

    public final void apical(Context context, HttpYoloConfigModel httpYoloConfigModel) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(httpYoloConfigModel, "httpYoloConfigModel");
        synchronized (attabal.class) {
            Map<String, HttpConfigModel> map = mHttpConfigMap;
            if (map.isEmpty()) {
                Unit unit = Unit.f29295attabal;
                kowloon(context);
                if (httpYoloConfigModel.getHttpBusiness().getHostUrl().length() == 0) {
                    throw new IllegalStateException("未配置 httpBusiness.hostUrl");
                }
                if (httpYoloConfigModel.getHttpBusiness().getAssetsResXTokenName().length() == 0) {
                    throw new IllegalStateException("未配置 httpBusiness.assetsResXTokenName");
                }
                if (httpYoloConfigModel.getHttpCommon().getHostUrl().length() == 0) {
                    throw new IllegalStateException("未配置 httpCommon.hostUrl");
                }
                if (httpYoloConfigModel.getHttpCommon().getAssetsResXTokenName().length() == 0) {
                    throw new IllegalStateException("未配置 httpCommon.assetsResXTokenName");
                }
                HttpConfigModel httpBusiness = httpYoloConfigModel.getHttpBusiness();
                petrol.attabal attabalVar = petrol.attabal.f35179attabal;
                httpBusiness.beachfront(attabalVar.arytenoidectomy(context, httpYoloConfigModel.getHttpBusiness().getAssetsResXTokenName()));
                httpYoloConfigModel.getHttpCommon().beachfront(attabalVar.arytenoidectomy(context, httpYoloConfigModel.getHttpCommon().getAssetsResXTokenName()));
                if (httpYoloConfigModel.getHttpBusiness().getRawXTokenByteArray() == null) {
                    throw new IllegalStateException("httpBusiness.rawXTokenByteArray 资源读取失败");
                }
                if (httpYoloConfigModel.getHttpCommon().getRawXTokenByteArray() == null) {
                    throw new IllegalStateException("httpCommon.rawXTokenByteArray 资源读取失败");
                }
                map.put("http_business", httpYoloConfigModel.getHttpBusiness());
                map.put("http_common", httpYoloConfigModel.getHttpCommon());
            }
        }
    }

    public final attabal attabal(Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        triweekly(application);
        kowloon(application);
        return this;
    }

    public final String beachfront(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        HttpConfigModel httpConfigModel = mHttpConfigMap.get(key);
        Intrinsics.beachfront(httpConfigModel);
        return httpConfigModel.getHostUrl();
    }

    public final HttpConfigModel competently(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (mContext == null) {
            throw new IllegalStateException("未初始化 mContext");
        }
        HttpConfigModel httpConfigModel = mHttpConfigMap.get(key);
        Intrinsics.beachfront(httpConfigModel);
        return httpConfigModel;
    }

    public final ExecutorService cutely() {
        ExecutorService mSingleThreadExecutor2 = mSingleThreadExecutor;
        Intrinsics.checkNotNullExpressionValue(mSingleThreadExecutor2, "mSingleThreadExecutor");
        return mSingleThreadExecutor2;
    }

    public final HttpConfigModel dern() {
        return competently("http_business");
    }

    public final void formularize(Context context, String assertName) {
        Intrinsics.checkNotNullParameter(context, "context");
        synchronized (attabal.class) {
            if (mHttpConfigMap.isEmpty()) {
                Unit unit = Unit.f29295attabal;
                apical(context, petrol.attabal.f35179attabal.monoploid(context, assertName));
            }
        }
    }

    public final boolean impromptu() {
        return IS_DEBUG;
    }

    public final void kowloon(Context context) {
        Intrinsics.checkNotNullParameter(context, "<set-?>");
        mContext = context;
    }

    public final HttpConfigModel marial() {
        return competently("http_common");
    }

    public final String saneness() {
        return beachfront("http_business");
    }

    public final Map<String, HttpConfigModel> taiyuan() {
        return mHttpConfigMap;
    }

    public final void triweekly(Application application) {
        Intrinsics.checkNotNullParameter(application, "<set-?>");
        mApplication = application;
    }

    public final String wireman() {
        return beachfront("http_common");
    }
}
