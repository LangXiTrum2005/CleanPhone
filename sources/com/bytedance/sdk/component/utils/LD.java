package com.bytedance.sdk.component.utils;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.view.View;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public class LD {
    private static Lxb Lxb;

    /* JADX INFO: renamed from: com.bytedance.sdk.component.utils.LD$LD, reason: collision with other inner class name */
    public interface InterfaceC0067LD {
        void Lxb();

        void Lxb(Throwable th);
    }

    public interface Lxb {
        ExecutorService getAsyncStartActivityThreadPool();

        boolean isEnableAsyncStartActivity();
    }

    public static void Lxb(Lxb lxb) {
        Lxb = lxb;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean lk(Context context, Intent intent, InterfaceC0067LD interfaceC0067LD) {
        if (context != null && intent != null) {
            try {
                if (!(context instanceof Activity)) {
                    intent.addFlags(268435456);
                }
                context.startActivity(intent);
                if (interfaceC0067LD == null) {
                    return true;
                }
                interfaceC0067LD.Lxb();
                return true;
            } catch (Throwable th) {
                if (interfaceC0067LD != null) {
                    interfaceC0067LD.Lxb(th);
                }
            }
        }
        return false;
    }

    public static boolean Lxb(Context context, Intent intent, InterfaceC0067LD interfaceC0067LD) {
        return Lxb(context, intent, interfaceC0067LD, false);
    }

    public static boolean Lxb(final Context context, final Intent intent, final InterfaceC0067LD interfaceC0067LD, boolean z) {
        Lxb lxb;
        ExecutorService asyncStartActivityThreadPool;
        if (z && (lxb = Lxb) != null && lxb.isEnableAsyncStartActivity() && (asyncStartActivityThreadPool = Lxb.getAsyncStartActivityThreadPool()) != null) {
            asyncStartActivityThreadPool.execute(new com.bytedance.sdk.component.OY.OY("startAct") { // from class: com.bytedance.sdk.component.utils.LD.1
                @Override // java.lang.Runnable
                public void run() {
                    LD.lk(context, intent, interfaceC0067LD);
                }
            });
            return true;
        }
        return lk(context, intent, interfaceC0067LD);
    }

    public static Activity Lxb(View view) {
        View viewFindViewById;
        Context context;
        if (view == null) {
            return null;
        }
        Context context2 = view.getContext();
        if (context2 instanceof Activity) {
            return (Activity) context2;
        }
        View rootView = view.getRootView();
        if (rootView == null || (viewFindViewById = rootView.findViewById(R.id.content)) == null || (context = viewFindViewById.getContext()) == null) {
            return null;
        }
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            Context baseContext = ((ContextWrapper) context).getBaseContext();
            if (baseContext instanceof Activity) {
                return (Activity) baseContext;
            }
        }
        return null;
    }
}
