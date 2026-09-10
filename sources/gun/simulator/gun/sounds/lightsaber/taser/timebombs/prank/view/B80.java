package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.badlogic.gdx.backends.android.SpineActivity;
import com.badlogic.gdx.net.HttpRequestHeader;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class B80 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2859a;

    public /* synthetic */ B80(int i) {
        this.f2859a = i;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        switch (this.f2859a) {
            case 0:
                SpineActivity.onResume$lambda$0();
                break;
            case 1:
                int i = AlarmManagerSchedulerBroadcastReceiver.f799a;
                break;
            case 2:
                C2961a4.m227init$lambda1$lambda0();
                break;
            case 3:
            case 4:
            case 5:
            case 6:
                break;
            case 7:
                String strC = C2375Du.a().c("Path_Test");
                if (((String) AbstractC3194cj.a().a()).length() == 0) {
                    AbstractC3194cj.a().b(strC);
                    S3.b("path_test", strC);
                }
                break;
            default:
                if (((String) AbstractC3194cj.a().a()).length() == 0) {
                    AbstractC3194cj.a().b(HttpRequestHeader.Origin);
                    S3.b("path_test", "Local");
                }
                break;
        }
    }
}
