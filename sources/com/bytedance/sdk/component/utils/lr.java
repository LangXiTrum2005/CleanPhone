package com.bytedance.sdk.component.utils;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.view.View;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public class lr {
    private static ri ri;

    /* JADX INFO: renamed from: com.bytedance.sdk.component.utils.lr$lr, reason: collision with other inner class name */
    public interface InterfaceC0216lr {
        void ri();

        void ri(Throwable th);
    }

    public interface ri {
        ExecutorService ik();

        boolean lr();

        boolean ri();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean ik(Context context, Intent intent, InterfaceC0216lr interfaceC0216lr) {
        if (context != null && intent != null) {
            try {
                if (!(context instanceof Activity)) {
                    intent.addFlags(268435456);
                }
                context.startActivity(intent);
                if (interfaceC0216lr == null) {
                    return true;
                }
                interfaceC0216lr.ri();
                return true;
            } catch (Throwable th) {
                if (interfaceC0216lr != null) {
                    interfaceC0216lr.ri(th);
                }
            }
        }
        return false;
    }

    public static void ri(ri riVar) {
        ri = riVar;
    }

    public static void ri(final Context context, final Intent intent, final InterfaceC0216lr interfaceC0216lr) {
        ExecutorService executorServiceIk;
        ri riVar = ri;
        if (riVar == null || !riVar.lr() || (executorServiceIk = ri.ik()) == null) {
            ik(context, intent, interfaceC0216lr);
        } else {
            executorServiceIk.execute(new Runnable() { // from class: com.bytedance.sdk.component.utils.lr.1
                @Override // java.lang.Runnable
                public void run() {
                    lr.ik(context, intent, interfaceC0216lr);
                }
            });
        }
    }

    public static boolean ri(final Context context, final Intent intent, final InterfaceC0216lr interfaceC0216lr, boolean z) {
        ri riVar;
        ExecutorService executorServiceIk;
        if (z && (riVar = ri) != null && riVar.ri() && (executorServiceIk = ri.ik()) != null) {
            executorServiceIk.execute(new Runnable() { // from class: com.bytedance.sdk.component.utils.lr.2
                @Override // java.lang.Runnable
                public void run() {
                    lr.ik(context, intent, interfaceC0216lr);
                }
            });
            return true;
        }
        return ik(context, intent, interfaceC0216lr);
    }

    public static Activity ri(View view) {
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

    public static boolean ri(Activity activity) {
        return activity == null || activity.isFinishing() || activity.isDestroyed();
    }
}
