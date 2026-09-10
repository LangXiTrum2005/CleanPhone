package shapoo;

import android.text.TextUtils;
import okhttp3.rotuma;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;
import warder.wireman;

/* JADX INFO: compiled from: IHttpUtil.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u001b\u0010\u0007\u001a\u00020\u00022\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0005H&¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lshapoo/saneness;", "", "", "getKey", "()Ljava/lang/String;", "Ljava/lang/Class;", "cls", "saneness", "(Ljava/lang/Class;)Ljava/lang/String;", "Lokhttp3/rotuma$attabal;", "attabal", "()Lokhttp3/rotuma$attabal;", "neworklibrary_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface saneness {

    /* JADX INFO: compiled from: IHttpUtil.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class attabal {
        public static <T> T attabal(saneness sanenessVar, Class<T> cls, String... pathKeys) {
            Intrinsics.checkNotNullParameter(cls, "cls");
            Intrinsics.checkNotNullParameter(pathKeys, "pathKeys");
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(sanenessVar.saneness(cls));
            for (String str : pathKeys) {
                if (!TextUtils.isEmpty(str)) {
                    stringBuffer.append(str);
                    stringBuffer.append("/");
                }
            }
            rotuma rotumaVarDern = sanenessVar.attabal().dern();
            String string = stringBuffer.toString();
            Intrinsics.checkNotNullExpressionValue(string, "baseUrlBuilder.toString()");
            return wireman.f39607attabal.saneness(rotumaVarDern, cls, string, sanenessVar.getKey()).saneness();
        }
    }

    rotuma.attabal attabal();

    String getKey();

    String saneness(Class<?> cls);
}
