package bto;

import android.content.Context;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ReadReferrerPropertiesUtil.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lbto/saneness;", "", "attabal", "referrerlibrary_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class saneness {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: bto.saneness$attabal, reason: from kotlin metadata */
    /* JADX INFO: compiled from: ReadReferrerPropertiesUtil.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lbto/saneness$attabal;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lgutturalization/attabal;", "attabal", "(Landroid/content/Context;)Lgutturalization/attabal;", "referrerlibrary_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final gutturalization.attabal attabal(Context context) throws IOException {
            Intrinsics.checkNotNullParameter(context, "context");
            Properties properties = new Properties();
            InputStream inputStreamOpen = context.getAssets().open("yolo_referrer.properties");
            Intrinsics.checkNotNullExpressionValue(inputStreamOpen, "context.assets.open(PROPERTIES_NAME)");
            properties.load(inputStreamOpen);
            gutturalization.attabal attabalVar = new gutturalization.attabal();
            String property = properties.getProperty("appsflyerKey");
            Intrinsics.checkNotNullExpressionValue(property, "props.getProperty(\"appsflyerKey\")");
            attabalVar.saneness(property);
            return attabalVar;
        }

        public Companion() {
        }
    }
}
