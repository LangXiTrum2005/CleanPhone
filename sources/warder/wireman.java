package warder;

import android.text.TextUtils;
import com.google.android.gms.ads.RequestConfiguration;
import com.ironsource.L6;
import com.ironsource.X3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import okhttp3.rotuma;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: HttpUtils.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JE\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f\"\u0004\b\u0000\u0010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0011\u001a\u00020\u00102\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J)\u0010\u0014\u001a\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\f\u0018\u00010\u00132\f\u0010\b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J)\u0010\u0017\u001a\u001c\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0007\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\f0\u00130\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018R2\u0010\u001a\u001a\u001e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0007\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\f0\u0013\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0019¨\u0006\u001b"}, d2 = {"Lwarder/wireman;", "", "<init>", "()V", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lokhttp3/rotuma;", "okHttpClient", "Ljava/lang/Class;", "cls", "", "baseUrl", X3.i.W, "Lwarder/saneness;", "saneness", "(Lokhttp3/rotuma;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;)Lwarder/saneness;", L6.B, "", "attabal", "(Lwarder/saneness;)V", "", "wireman", "(Ljava/lang/Class;)Ljava/util/List;", "", "dern", "()Ljava/util/Map;", "Ljava/util/Map;", "apiMap", "neworklibrary_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class wireman {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final wireman f39607attabal = new wireman();

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public static volatile Map<Class<?>, List<saneness<?>>> apiMap;

    public final void attabal(saneness<?> model) {
        Object objSaneness = model.saneness();
        Intrinsics.beachfront(objSaneness);
        Class<?> cls = objSaneness.getClass();
        List<saneness<?>> listWireman = wireman(cls);
        Intrinsics.beachfront(listWireman);
        if (!listWireman.contains(model)) {
            listWireman.add(model);
        }
        dern().put(cls, listWireman);
    }

    public final Map<Class<?>, List<saneness<?>>> dern() {
        if (apiMap == null) {
            apiMap = Collections.synchronizedMap(new HashMap(16));
        }
        Map<Class<?>, List<saneness<?>>> map = apiMap;
        Intrinsics.beachfront(map);
        return map;
    }

    public final <T> saneness<T> saneness(rotuma okHttpClient, Class<T> cls, String baseUrl, String key) {
        saneness sanenessVar;
        Intrinsics.checkNotNullParameter(cls, "cls");
        Intrinsics.checkNotNullParameter(baseUrl, "baseUrl");
        Intrinsics.checkNotNullParameter(key, "key");
        List<saneness<?>> listWireman = wireman(cls);
        Intrinsics.beachfront(listWireman);
        Iterator<saneness<?>> it = listWireman.iterator();
        while (true) {
            if (!it.hasNext()) {
                sanenessVar = null;
                break;
            }
            sanenessVar = it.next();
            String baseUrl2 = sanenessVar.getBaseUrl();
            if (TextUtils.isEmpty(baseUrl2)) {
                baseUrl2 = "";
            }
            if (Intrinsics.wireman(baseUrl2, baseUrl)) {
                Intrinsics.competently(sanenessVar, "null cannot be cast to non-null type com.yolo.networklibrary.http.base.api.ApiModel<T of com.yolo.networklibrary.http.base.api.HttpUtils.create>");
                break;
            }
        }
        if (sanenessVar == null) {
            sanenessVar = new saneness<>(key, okHttpClient, baseUrl, cls);
        }
        attabal(sanenessVar);
        return sanenessVar;
    }

    public final List<saneness<?>> wireman(Class<?> cls) {
        List<saneness<?>> list = dern().get(cls);
        return list == null ? Collections.synchronizedList(new ArrayList()) : list;
    }
}
