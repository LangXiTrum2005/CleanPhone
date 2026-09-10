package com.gyf.immersionbar;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.v4.media.a;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentTransaction;
import com.thinkup.core.common.n.mo;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
class RequestManagerRetriever implements Handler.Callback {
    public final String X = ImmersionBar.class.getName().concat(mo.ono);
    public final HashMap Z = new HashMap();
    public final HashMap e0 = new HashMap();
    public final HashMap f0 = new HashMap();
    public final HashMap g0 = new HashMap();

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final Handler f21441Y = new Handler(Looper.getMainLooper(), this);

    public static class Holder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final RequestManagerRetriever f21442a = new RequestManagerRetriever();
    }

    public final ImmersionBar a(Activity activity) {
        if (activity == null) {
            throw new NullPointerException("activity is null");
        }
        StringBuilder sbW = a.w(this.X + activity.getClass().getName());
        sbW.append(System.identityHashCode(activity));
        sbW.append(".tag.notOnly.");
        String string = sbW.toString();
        boolean z2 = activity instanceof FragmentActivity;
        Handler handler = this.f21441Y;
        if (!z2) {
            FragmentManager fragmentManager = activity.getFragmentManager();
            RequestBarManagerFragment requestBarManagerFragment = (RequestBarManagerFragment) fragmentManager.findFragmentByTag(string);
            if (requestBarManagerFragment == null) {
                HashMap map = this.Z;
                RequestBarManagerFragment requestBarManagerFragment2 = (RequestBarManagerFragment) map.get(fragmentManager);
                if (requestBarManagerFragment2 == null) {
                    if (Build.VERSION.SDK_INT >= 26) {
                        for (Fragment fragment : fragmentManager.getFragments()) {
                            if (fragment instanceof RequestBarManagerFragment) {
                                String tag = fragment.getTag();
                                if (tag == null) {
                                    fragmentManager.beginTransaction().remove(fragment).commitAllowingStateLoss();
                                } else if (tag.contains(".tag.notOnly.")) {
                                    fragmentManager.beginTransaction().remove(fragment).commitAllowingStateLoss();
                                }
                            }
                        }
                    }
                    RequestBarManagerFragment requestBarManagerFragment3 = new RequestBarManagerFragment();
                    map.put(fragmentManager, requestBarManagerFragment3);
                    fragmentManager.beginTransaction().add(requestBarManagerFragment3, string).commitAllowingStateLoss();
                    handler.obtainMessage(1, fragmentManager).sendToTarget();
                    requestBarManagerFragment = requestBarManagerFragment3;
                } else {
                    requestBarManagerFragment = requestBarManagerFragment2;
                }
            }
            if (requestBarManagerFragment.X == null) {
                requestBarManagerFragment.X = new ImmersionDelegate(activity);
            }
            return requestBarManagerFragment.X.X;
        }
        androidx.fragment.app.FragmentManager supportFragmentManager = ((FragmentActivity) activity).getSupportFragmentManager();
        SupportRequestBarManagerFragment supportRequestBarManagerFragment = (SupportRequestBarManagerFragment) supportFragmentManager.C(string);
        if (supportRequestBarManagerFragment == null) {
            HashMap map2 = this.e0;
            SupportRequestBarManagerFragment supportRequestBarManagerFragment2 = (SupportRequestBarManagerFragment) map2.get(supportFragmentManager);
            if (supportRequestBarManagerFragment2 == null) {
                for (androidx.fragment.app.Fragment fragment2 : supportFragmentManager.F()) {
                    if (fragment2 instanceof SupportRequestBarManagerFragment) {
                        String tag2 = fragment2.getTag();
                        if (tag2 == null) {
                            FragmentTransaction fragmentTransactionD = supportFragmentManager.d();
                            fragmentTransactionD.j(fragment2);
                            fragmentTransactionD.d();
                        } else if (tag2.contains(".tag.notOnly.")) {
                            FragmentTransaction fragmentTransactionD2 = supportFragmentManager.d();
                            fragmentTransactionD2.j(fragment2);
                            fragmentTransactionD2.d();
                        }
                    }
                }
                SupportRequestBarManagerFragment supportRequestBarManagerFragment3 = new SupportRequestBarManagerFragment();
                map2.put(supportFragmentManager, supportRequestBarManagerFragment3);
                FragmentTransaction fragmentTransactionD3 = supportFragmentManager.d();
                fragmentTransactionD3.h(0, supportRequestBarManagerFragment3, string, 1);
                fragmentTransactionD3.d();
                handler.obtainMessage(2, supportFragmentManager).sendToTarget();
                supportRequestBarManagerFragment = supportRequestBarManagerFragment3;
            } else {
                supportRequestBarManagerFragment = supportRequestBarManagerFragment2;
            }
        }
        if (supportRequestBarManagerFragment.X == null) {
            supportRequestBarManagerFragment.X = new ImmersionDelegate(activity);
        }
        return supportRequestBarManagerFragment.X.X;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i2 = message.what;
        if (i2 == 1) {
            this.Z.remove((FragmentManager) message.obj);
            return true;
        }
        if (i2 == 2) {
            this.e0.remove((androidx.fragment.app.FragmentManager) message.obj);
            return true;
        }
        if (i2 == 3) {
            this.f0.remove((String) message.obj);
            return true;
        }
        if (i2 != 4) {
            return false;
        }
        this.g0.remove((String) message.obj);
        return true;
    }
}
