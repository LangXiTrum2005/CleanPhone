package com.bytedance.sdk.component.utils;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.view.View;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public class ud {
    private static qdl qdl;

    public interface qdl {
        ExecutorService getAsyncStartActivityThreadPool();

        boolean isEnableAsyncStartActivity();

        boolean isStartActivityBySubThread();
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.component.utils.ud$ud, reason: collision with other inner class name */
    public interface InterfaceC0095ud {
        void qdl();

        void qdl(Throwable th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean lnr(Context context, Intent intent, InterfaceC0095ud interfaceC0095ud) {
        if (context != null && intent != null) {
            try {
                if (!(context instanceof Activity)) {
                    intent.addFlags(268435456);
                }
                context.startActivity(intent);
                if (interfaceC0095ud == null) {
                    return true;
                }
                interfaceC0095ud.qdl();
                return true;
            } catch (Throwable th) {
                if (interfaceC0095ud != null) {
                    interfaceC0095ud.qdl(th);
                }
            }
        }
        return false;
    }

    public static void qdl(qdl qdlVar) {
        qdl = qdlVar;
    }

    public static void qdl(final Context context, final Intent intent, final InterfaceC0095ud interfaceC0095ud) {
        ExecutorService asyncStartActivityThreadPool;
        qdl qdlVar = qdl;
        if (qdlVar == null || !qdlVar.isStartActivityBySubThread() || (asyncStartActivityThreadPool = qdl.getAsyncStartActivityThreadPool()) == null) {
            lnr(context, intent, interfaceC0095ud);
        } else {
            asyncStartActivityThreadPool.execute(new com.bytedance.sdk.component.jpc.jpc("startAct") { // from class: com.bytedance.sdk.component.utils.ud.1
                @Override // java.lang.Runnable
                public void run() {
                    ud.lnr(context, intent, interfaceC0095ud);
                }
            });
        }
    }

    public static boolean qdl(final Context context, final Intent intent, final InterfaceC0095ud interfaceC0095ud, boolean z2) {
        qdl qdlVar;
        ExecutorService asyncStartActivityThreadPool;
        if (z2 && (qdlVar = qdl) != null && qdlVar.isEnableAsyncStartActivity() && (asyncStartActivityThreadPool = qdl.getAsyncStartActivityThreadPool()) != null) {
            asyncStartActivityThreadPool.execute(new com.bytedance.sdk.component.jpc.jpc("startAct") { // from class: com.bytedance.sdk.component.utils.ud.2
                @Override // java.lang.Runnable
                public void run() {
                    ud.lnr(context, intent, interfaceC0095ud);
                }
            });
            return true;
        }
        return lnr(context, intent, interfaceC0095ud);
    }

    public static Activity qdl(View view) {
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

    public static boolean qdl(Activity activity) {
        return activity == null || activity.isFinishing() || activity.isDestroyed();
    }
}
