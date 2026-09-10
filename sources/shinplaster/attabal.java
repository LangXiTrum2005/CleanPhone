package shinplaster;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import com.codejoy.boom.clap.receiver.TimeChangeReceiver;
import java.util.ArrayList;
import java.util.List;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BroadcastRegisterHelper.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000e¨\u0006\u0010"}, d2 = {"Lshinplaster/attabal;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "attabal", "(Landroid/content/Context;)V", "Lcom/codejoy/boom/clap/receiver/TimeChangeReceiver;", "saneness", "(Landroid/content/Context;)Lcom/codejoy/boom/clap/receiver/TimeChangeReceiver;", "", "Landroid/content/BroadcastReceiver;", "Ljava/util/List;", "receivers", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class attabal {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final attabal f37629attabal = new attabal();

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public static final List<BroadcastReceiver> receivers = new ArrayList();

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final int f37630dern = 8;

    public final void attabal(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        receivers.add(saneness(context));
    }

    public final TimeChangeReceiver saneness(Context context) {
        TimeChangeReceiver timeChangeReceiver = new TimeChangeReceiver();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.TIME_TICK");
        intentFilter.addAction("android.intent.action.TIME_SET");
        intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
        Unit unit = Unit.f29295attabal;
        context.registerReceiver(timeChangeReceiver, intentFilter);
        return timeChangeReceiver;
    }
}
