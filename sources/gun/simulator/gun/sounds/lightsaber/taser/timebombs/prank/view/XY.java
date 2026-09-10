package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.gyf.immersionbar.SupportRequestBarManagerFragment;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class XY implements Handler.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3974a = com.gyf.immersionbar.a.class.getName().concat(".");
    public final HashMap c = new HashMap();
    public final HashMap d = new HashMap();
    public final HashMap e = new HashMap();
    public final HashMap f = new HashMap();
    public final Handler b = new Handler(Looper.getMainLooper(), this);

    public final JY a(FragmentManager fragmentManager, String str, boolean z) {
        JY jy = (JY) fragmentManager.findFragmentByTag(str);
        Handler handler = this.b;
        if (jy == null) {
            HashMap map = this.c;
            JY jy2 = (JY) map.get(fragmentManager);
            if (jy2 == null) {
                if (z) {
                    return null;
                }
                if (Build.VERSION.SDK_INT >= 26) {
                    for (Fragment fragment : fragmentManager.getFragments()) {
                        if (fragment instanceof JY) {
                            String tag = fragment.getTag();
                            if (tag == null) {
                                fragmentManager.beginTransaction().remove(fragment).commitAllowingStateLoss();
                            } else if (tag.contains(".tag.notOnly.")) {
                                fragmentManager.beginTransaction().remove(fragment).commitAllowingStateLoss();
                            }
                        }
                    }
                }
                jy2 = new JY();
                map.put(fragmentManager, jy2);
                fragmentManager.beginTransaction().add(jy2, str).commitAllowingStateLoss();
                handler.obtainMessage(1, fragmentManager).sendToTarget();
            }
            jy = jy2;
        }
        if (!z) {
            return jy;
        }
        HashMap map2 = this.e;
        if (map2.get(str) == null) {
            map2.put(str, jy);
            fragmentManager.beginTransaction().remove(jy).commitAllowingStateLoss();
            handler.obtainMessage(3, str).sendToTarget();
        }
        return null;
    }

    public final SupportRequestBarManagerFragment b(androidx.fragment.app.FragmentManager fragmentManager, String str, boolean z) {
        SupportRequestBarManagerFragment supportRequestBarManagerFragment = (SupportRequestBarManagerFragment) fragmentManager.findFragmentByTag(str);
        Handler handler = this.b;
        if (supportRequestBarManagerFragment == null) {
            HashMap map = this.d;
            SupportRequestBarManagerFragment supportRequestBarManagerFragment2 = (SupportRequestBarManagerFragment) map.get(fragmentManager);
            if (supportRequestBarManagerFragment2 == null) {
                if (z) {
                    return null;
                }
                for (androidx.fragment.app.Fragment fragment : fragmentManager.getFragments()) {
                    if (fragment instanceof SupportRequestBarManagerFragment) {
                        String tag = fragment.getTag();
                        if (tag == null) {
                            fragmentManager.beginTransaction().remove(fragment).commitAllowingStateLoss();
                        } else if (tag.contains(".tag.notOnly.")) {
                            fragmentManager.beginTransaction().remove(fragment).commitAllowingStateLoss();
                        }
                    }
                }
                supportRequestBarManagerFragment2 = new SupportRequestBarManagerFragment();
                map.put(fragmentManager, supportRequestBarManagerFragment2);
                fragmentManager.beginTransaction().add(supportRequestBarManagerFragment2, str).commitAllowingStateLoss();
                handler.obtainMessage(2, fragmentManager).sendToTarget();
            }
            supportRequestBarManagerFragment = supportRequestBarManagerFragment2;
        }
        if (!z) {
            return supportRequestBarManagerFragment;
        }
        HashMap map2 = this.f;
        if (map2.get(str) == null) {
            map2.put(str, supportRequestBarManagerFragment);
            fragmentManager.beginTransaction().remove(supportRequestBarManagerFragment).commitAllowingStateLoss();
            handler.obtainMessage(4, str).sendToTarget();
        }
        return null;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            this.c.remove((FragmentManager) message.obj);
            return true;
        }
        if (i == 2) {
            this.d.remove((androidx.fragment.app.FragmentManager) message.obj);
            return true;
        }
        if (i == 3) {
            this.e.remove((String) message.obj);
            return true;
        }
        if (i != 4) {
            return false;
        }
        this.f.remove((String) message.obj);
        return true;
    }
}
