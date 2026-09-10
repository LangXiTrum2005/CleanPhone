package mucocutaneous;

import android.app.Application;
import android.content.ComponentCallbacks2;
import com.blankj.utilcode.util.impromptu;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.yolo.networklibrary.common.model.HttpYoloConfigModel;
import java.util.List;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;
import retrofit2.dern;
import retrofit2.preprohormone;

/* JADX INFO: compiled from: HttpInit.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0002\u000f\u0007B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lmucocutaneous/attabal;", "", "<init>", "()V", "Lmucocutaneous/attabal$attabal;", "builder", "", "saneness", "(Lmucocutaneous/attabal$attabal;)V", "", "keyName", "Lcom/google/gson/Gson;", "gson", "dern", "(Ljava/lang/String;Lcom/google/gson/Gson;Lmucocutaneous/attabal$attabal;)V", "attabal", "neworklibrary_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class attabal {

    /* JADX INFO: renamed from: mucocutaneous.attabal$attabal, reason: collision with other inner class name */
    /* JADX INFO: compiled from: HttpInit.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0011\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0003R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\t\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR$\u0010\r\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lmucocutaneous/attabal$attabal;", "", "<init>", "()V", "Landroid/app/Application;", "application", "marial", "(Landroid/app/Application;)Lmucocutaneous/attabal$attabal;", "Lretrofit2/dern$attabal;", "callAdapterFactory", "beachfront", "(Lretrofit2/dern$attabal;)Lmucocutaneous/attabal$attabal;", "Lcom/yolo/networklibrary/common/model/HttpYoloConfigModel;", "httpYoloConfigModel", "competently", "(Lcom/yolo/networklibrary/common/model/HttpYoloConfigModel;)Lmucocutaneous/attabal$attabal;", "", "attabal", "Landroid/app/Application;", "saneness", "()Landroid/app/Application;", "setApplication", "(Landroid/app/Application;)V", "Lretrofit2/dern$attabal;", "dern", "()Lretrofit2/dern$attabal;", "setCallAdapterFactory", "(Lretrofit2/dern$attabal;)V", "Lcom/yolo/networklibrary/common/model/HttpYoloConfigModel;", "wireman", "()Lcom/yolo/networklibrary/common/model/HttpYoloConfigModel;", "setHttpYoloConfigModel", "(Lcom/yolo/networklibrary/common/model/HttpYoloConfigModel;)V", "neworklibrary_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class C0748attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
        public Application application;

        /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
        public HttpYoloConfigModel httpYoloConfigModel;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
        public dern.attabal callAdapterFactory;

        public final void attabal() {
            if (this.application == null) {
                throw new IllegalStateException("application is null");
            }
            new attabal().saneness(this);
        }

        public final C0748attabal beachfront(dern.attabal callAdapterFactory) {
            Intrinsics.checkNotNullParameter(callAdapterFactory, "callAdapterFactory");
            this.callAdapterFactory = callAdapterFactory;
            return this;
        }

        public final C0748attabal competently(HttpYoloConfigModel httpYoloConfigModel) {
            Intrinsics.checkNotNullParameter(httpYoloConfigModel, "httpYoloConfigModel");
            this.httpYoloConfigModel = httpYoloConfigModel;
            return this;
        }

        /* JADX INFO: renamed from: dern, reason: from getter */
        public final dern.attabal getCallAdapterFactory() {
            return this.callAdapterFactory;
        }

        public final C0748attabal marial(Application application) {
            Intrinsics.checkNotNullParameter(application, "application");
            this.application = application;
            return this;
        }

        /* JADX INFO: renamed from: saneness, reason: from getter */
        public final Application getApplication() {
            return this.application;
        }

        /* JADX INFO: renamed from: wireman, reason: from getter */
        public final HttpYoloConfigModel getHttpYoloConfigModel() {
            return this.httpYoloConfigModel;
        }
    }

    /* JADX INFO: compiled from: HttpInit.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lmucocutaneous/attabal$saneness;", "", "", "Lirreclaimable/saneness;", "attabal", "()Ljava/util/List;", "neworklibrary_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface saneness {
        List<irreclaimable.saneness> attabal();
    }

    public final void dern(String keyName, Gson gson, C0748attabal builder) {
        preprohormone.saneness sanenessVarSaneness = new preprohormone.saneness().saneness(poleward.attabal.beachfront(gson));
        if (builder.getCallAdapterFactory() != null) {
            sanenessVarSaneness.attabal(builder.getCallAdapterFactory());
        }
        warder.dern.INSTANCE.attabal(keyName, sanenessVarSaneness);
    }

    public final void saneness(C0748attabal builder) {
        if (builder.getHttpYoloConfigModel() != null) {
            revolt.attabal attabalVar = revolt.attabal.f36720attabal;
            Application application = builder.getApplication();
            Intrinsics.beachfront(application);
            HttpYoloConfigModel httpYoloConfigModel = builder.getHttpYoloConfigModel();
            Intrinsics.beachfront(httpYoloConfigModel);
            attabalVar.apical(application, httpYoloConfigModel);
        } else {
            revolt.attabal attabalVar2 = revolt.attabal.f36720attabal;
            Application application2 = builder.getApplication();
            Intrinsics.beachfront(application2);
            revolt.attabal.impassible(attabalVar2, application2, null, 2, null);
        }
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.setObjectToNumberStrategy(new kcia.attabal());
        Gson gson = gsonBuilder.create();
        impromptu.competently(gson);
        Intrinsics.checkNotNullExpressionValue(gson, "gson");
        dern("yolo_http_key", gson, builder);
        dern("yolo_business_http_key", gson, builder);
        if (builder.getApplication() instanceof saneness) {
            irreclaimable.attabal attabalVar3 = irreclaimable.attabal.f29000attabal;
            ComponentCallbacks2 application3 = builder.getApplication();
            Intrinsics.beachfront(application3);
            attabalVar3.attabal(((saneness) application3).attabal());
        }
    }
}
