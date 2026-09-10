package androidx.room;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteTransactionListener;
import android.os.CancellationSignal;
import androidx.sqlite.db.framework.FrameworkSQLiteDatabase;
import com.charging.screenshow.battery.animations.themes.activity.Charging3DAct;
import com.charging.screenshow.battery.animations.themes.activity.ImagePreviewAct;
import com.charging.screenshow.battery.animations.themes.broadcast.BroadcastManager;
import com.charging.screenshow.battery.animations.themes.download.DownloadManager;
import com.charging.screenshow.battery.animations.themes.download.HttpUtil;
import com.charging.screenshow.battery.animations.themes.manager.ReturnAppManager;
import com.zg.adlib.service.ZGADLogManager;
import java.lang.reflect.Method;
import java.util.LinkedHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function0;
import kotlin.text.CharDirectionality;
import kotlinx.serialization.json.JsonElementSerializer;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements Function0 {
    public final /* synthetic */ int X;

    public /* synthetic */ e(int i2) {
        this.X = i2;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Class<?> returnType;
        Unit unit = Unit.f43263a;
        switch (this.X) {
            case 0:
                return Boolean.TRUE;
            case 1:
                String[] strArr = FrameworkSQLiteDatabase.f8372Y;
                try {
                    Method declaredMethod = SQLiteDatabase.class.getDeclaredMethod("getThreadSession", new Class[0]);
                    declaredMethod.setAccessible(true);
                    return declaredMethod;
                } catch (Throwable unused) {
                    return null;
                }
            case 2:
                try {
                    Method method = (Method) FrameworkSQLiteDatabase.Z.getX();
                    if (method == null || (returnType = method.getReturnType()) == null) {
                        return null;
                    }
                    Class cls = Integer.TYPE;
                    return returnType.getDeclaredMethod("beginTransaction", cls, SQLiteTransactionListener.class, cls, CancellationSignal.class);
                } catch (Throwable unused2) {
                    return null;
                }
            case 3:
                return ZGADLogManager.instance_delegate$lambda$4();
            case 4:
                int i2 = Charging3DAct.o0;
                return unit;
            case 5:
                int i3 = ImagePreviewAct.p0;
                return unit;
            case 6:
                return new ReturnAppManager();
            case 7:
                return Long.valueOf(System.currentTimeMillis());
            case 8:
                return new BroadcastManager();
            case 9:
                DownloadManager downloadManager = new DownloadManager();
                downloadManager.f13237a = new LinkedHashMap();
                return downloadManager;
            case 10:
                HttpUtil httpUtil = new HttpUtil();
                OkHttpClient.Builder builder = new OkHttpClient.Builder();
                TimeUnit timeUnit = TimeUnit.SECONDS;
                httpUtil.f13256a = builder.connectTimeout(60L, timeUnit).writeTimeout(60L, timeUnit).readTimeout(60L, timeUnit).build();
                MediaType.INSTANCE.get("application/json; charset=utf-8");
                return httpUtil;
            case 11:
                EnumEntries enumEntries = CharDirectionality.e0;
                int iH = MapsKt.h(CollectionsKt.n(enumEntries, 10));
                if (iH < 16) {
                    iH = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iH);
                for (Object obj : enumEntries) {
                    linkedHashMap.put(Integer.valueOf(((CharDirectionality) obj).X), obj);
                }
                return linkedHashMap;
            case 12:
                return JsonElementSerializer.descriptor$lambda$5$lambda$0();
            case 13:
                return JsonElementSerializer.descriptor$lambda$5$lambda$1();
            case 14:
                return JsonElementSerializer.descriptor$lambda$5$lambda$2();
            case 15:
                return JsonElementSerializer.descriptor$lambda$5$lambda$3();
            default:
                return JsonElementSerializer.descriptor$lambda$5$lambda$4();
        }
    }
}
