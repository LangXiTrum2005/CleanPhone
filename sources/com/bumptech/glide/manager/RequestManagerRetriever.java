package com.bumptech.glide.manager;

import android.app.Activity;
import android.app.Application;
import android.app.FragmentManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import androidx.collection.ArrayMap;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentTransaction;
import com.bumptech.glide.Glide;
import com.bumptech.glide.GlideBuilder;
import com.bumptech.glide.GlideExperiments;
import com.bumptech.glide.RequestManager;
import com.bumptech.glide.load.resource.bitmap.HardwareConfigState;
import com.bumptech.glide.util.Util;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class RequestManagerRetriever implements Handler.Callback {
    public static final RequestManagerFactory i0 = new AnonymousClass1();
    public volatile RequestManager X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final HashMap f12754Y = new HashMap();
    public final HashMap Z = new HashMap();
    public final Handler e0;
    public final RequestManagerFactory f0;
    public final FrameWaiter g0;
    public final LifecycleRequestManagerRetriever h0;

    /* JADX INFO: renamed from: com.bumptech.glide.manager.RequestManagerRetriever$1, reason: invalid class name */
    public class AnonymousClass1 implements RequestManagerFactory {
        @Override // com.bumptech.glide.manager.RequestManagerRetriever.RequestManagerFactory
        public final RequestManager a(Glide glide, Lifecycle lifecycle, RequestManagerTreeNode requestManagerTreeNode, Context context) {
            return new RequestManager(glide, lifecycle, requestManagerTreeNode, context);
        }
    }

    public interface RequestManagerFactory {
        RequestManager a(Glide glide, Lifecycle lifecycle, RequestManagerTreeNode requestManagerTreeNode, Context context);
    }

    public RequestManagerRetriever(GlideExperiments glideExperiments) {
        new ArrayMap(0);
        new ArrayMap(0);
        new Bundle();
        RequestManagerFactory requestManagerFactory = i0;
        this.f0 = requestManagerFactory;
        this.e0 = new Handler(Looper.getMainLooper(), this);
        this.h0 = new LifecycleRequestManagerRetriever(requestManagerFactory);
        this.g0 = (HardwareConfigState.f12666h && HardwareConfigState.g) ? glideExperiments.f12297a.containsKey(GlideBuilder.WaitForFramesAfterTrimMemory.class) ? new FirstFrameAndAfterTrimMemoryWaiter() : new FirstFrameWaiter() : new DoNothingFirstFrameWaiter();
    }

    public static Activity a(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return a(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public final RequestManager b(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("You cannot start a load on a null Context");
        }
        char[] cArr = Util.f12851a;
        if (Looper.myLooper() == Looper.getMainLooper() && !(context instanceof Application)) {
            if (context instanceof FragmentActivity) {
                return c((FragmentActivity) context);
            }
            if (context instanceof Activity) {
                Activity activity = (Activity) context;
                if (!(Looper.myLooper() == Looper.getMainLooper())) {
                    return b(activity.getApplicationContext());
                }
                if (activity instanceof FragmentActivity) {
                    return c((FragmentActivity) activity);
                }
                if (activity.isDestroyed()) {
                    throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
                }
                this.g0.getClass();
                FragmentManager fragmentManager = activity.getFragmentManager();
                Activity activityA = a(activity);
                boolean z2 = activityA == null || !activityA.isFinishing();
                RequestManagerFragment requestManagerFragmentD = d(fragmentManager);
                RequestManager requestManager = requestManagerFragmentD.e0;
                if (requestManager != null) {
                    return requestManager;
                }
                RequestManager requestManagerA = this.f0.a(Glide.a(activity), requestManagerFragmentD.X, requestManagerFragmentD.f12752Y, activity);
                if (z2) {
                    requestManagerA.onStart();
                }
                requestManagerFragmentD.e0 = requestManagerA;
                return requestManagerA;
            }
            if (context instanceof ContextWrapper) {
                ContextWrapper contextWrapper = (ContextWrapper) context;
                if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                    return b(contextWrapper.getBaseContext());
                }
            }
        }
        if (this.X == null) {
            synchronized (this) {
                try {
                    if (this.X == null) {
                        this.X = this.f0.a(Glide.a(context.getApplicationContext()), new ApplicationLifecycle(), new EmptyRequestManagerTreeNode(), context.getApplicationContext());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.X;
    }

    public final RequestManager c(FragmentActivity fragmentActivity) {
        char[] cArr = Util.f12851a;
        if (!(Looper.myLooper() == Looper.getMainLooper())) {
            return b(fragmentActivity.getApplicationContext());
        }
        if (fragmentActivity.isDestroyed()) {
            throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
        }
        this.g0.getClass();
        Activity activityA = a(fragmentActivity);
        boolean z2 = activityA == null || !activityA.isFinishing();
        Glide glideA = Glide.a(fragmentActivity.getApplicationContext());
        final androidx.lifecycle.Lifecycle lifecycle = fragmentActivity.getLifecycle();
        fragmentActivity.getSupportFragmentManager();
        final LifecycleRequestManagerRetriever lifecycleRequestManagerRetriever = this.h0;
        lifecycleRequestManagerRetriever.getClass();
        Util.a();
        Util.a();
        HashMap map = lifecycleRequestManagerRetriever.f12749a;
        RequestManager requestManager = (RequestManager) map.get(lifecycle);
        if (requestManager != null) {
            return requestManager;
        }
        LifecycleLifecycle lifecycleLifecycle = new LifecycleLifecycle(lifecycle);
        RequestManager requestManagerA = lifecycleRequestManagerRetriever.f12750b.a(glideA, lifecycleLifecycle, new LifecycleRequestManagerRetriever.SupportRequestManagerTreeNode(), fragmentActivity);
        map.put(lifecycle, requestManagerA);
        lifecycleLifecycle.b(new LifecycleListener() { // from class: com.bumptech.glide.manager.LifecycleRequestManagerRetriever.1
            @Override // com.bumptech.glide.manager.LifecycleListener
            public final void onDestroy() {
                LifecycleRequestManagerRetriever.this.f12749a.remove(lifecycle);
            }

            @Override // com.bumptech.glide.manager.LifecycleListener
            public final void onStart() {
            }

            @Override // com.bumptech.glide.manager.LifecycleListener
            public final void onStop() {
            }
        });
        if (z2) {
            requestManagerA.onStart();
        }
        return requestManagerA;
    }

    public final RequestManagerFragment d(FragmentManager fragmentManager) {
        HashMap map = this.f12754Y;
        RequestManagerFragment requestManagerFragment = (RequestManagerFragment) map.get(fragmentManager);
        if (requestManagerFragment != null) {
            return requestManagerFragment;
        }
        RequestManagerFragment requestManagerFragment2 = (RequestManagerFragment) fragmentManager.findFragmentByTag("com.bumptech.glide.manager");
        if (requestManagerFragment2 != null) {
            return requestManagerFragment2;
        }
        RequestManagerFragment requestManagerFragment3 = new RequestManagerFragment();
        map.put(fragmentManager, requestManagerFragment3);
        fragmentManager.beginTransaction().add(requestManagerFragment3, "com.bumptech.glide.manager").commitAllowingStateLoss();
        this.e0.obtainMessage(1, fragmentManager).sendToTarget();
        return requestManagerFragment3;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        Object obj;
        Object obj2;
        boolean z2 = true;
        boolean z3 = false;
        boolean z4 = message.arg1 == 1;
        int i2 = message.what;
        Handler handler = this.e0;
        Object objRemove = null;
        if (i2 != 1) {
            if (i2 != 2) {
                z2 = false;
            } else {
                androidx.fragment.app.FragmentManager fragmentManager = (androidx.fragment.app.FragmentManager) message.obj;
                HashMap map = this.Z;
                SupportRequestManagerFragment supportRequestManagerFragment = (SupportRequestManagerFragment) map.get(fragmentManager);
                SupportRequestManagerFragment supportRequestManagerFragment2 = (SupportRequestManagerFragment) fragmentManager.C("com.bumptech.glide.manager");
                if (supportRequestManagerFragment2 != supportRequestManagerFragment) {
                    if (z4 || fragmentManager.H) {
                        if (fragmentManager.H) {
                            if (Log.isLoggable("RMRetriever", 5)) {
                                Log.w("RMRetriever", "Parent was destroyed before our Fragment could be added, all requests for the destroyed parent are cancelled");
                            }
                        } else if (Log.isLoggable("RMRetriever", 6)) {
                            Log.e("RMRetriever", "ERROR: Tried adding Fragment twice and failed twice, giving up and cancelling all associated requests! This probably means you're starting loads in a unit test with an Activity that you haven't created and never create. If you're using Robolectric, create the Activity as part of your test setup");
                        }
                        supportRequestManagerFragment.X.c();
                    } else {
                        FragmentTransaction fragmentTransactionD = fragmentManager.d();
                        fragmentTransactionD.h(0, supportRequestManagerFragment, "com.bumptech.glide.manager", 1);
                        if (supportRequestManagerFragment2 != null) {
                            fragmentTransactionD.j(supportRequestManagerFragment2);
                        }
                        fragmentTransactionD.f();
                        handler.obtainMessage(2, 1, 0, fragmentManager).sendToTarget();
                        if (Log.isLoggable("RMRetriever", 3)) {
                            Log.d("RMRetriever", "We failed to add our Fragment the first time around, trying again...");
                        }
                        z3 = true;
                        z2 = false;
                    }
                }
                objRemove = map.remove(fragmentManager);
                obj = fragmentManager;
                z3 = true;
                obj2 = obj;
            }
            obj2 = null;
        } else {
            FragmentManager fragmentManager2 = (FragmentManager) message.obj;
            HashMap map2 = this.f12754Y;
            RequestManagerFragment requestManagerFragment = (RequestManagerFragment) map2.get(fragmentManager2);
            RequestManagerFragment requestManagerFragment2 = (RequestManagerFragment) fragmentManager2.findFragmentByTag("com.bumptech.glide.manager");
            if (requestManagerFragment2 != requestManagerFragment) {
                if (requestManagerFragment2 != null && requestManagerFragment2.e0 != null) {
                    throw new IllegalStateException("We've added two fragments with requests! Old: " + requestManagerFragment2 + " New: " + requestManagerFragment);
                }
                if (z4 || fragmentManager2.isDestroyed()) {
                    if (Log.isLoggable("RMRetriever", 5)) {
                        if (fragmentManager2.isDestroyed()) {
                            Log.w("RMRetriever", "Parent was destroyed before our Fragment could be added");
                        } else {
                            Log.w("RMRetriever", "Tried adding Fragment twice and failed twice, giving up!");
                        }
                    }
                    requestManagerFragment.X.c();
                } else {
                    android.app.FragmentTransaction fragmentTransactionAdd = fragmentManager2.beginTransaction().add(requestManagerFragment, "com.bumptech.glide.manager");
                    if (requestManagerFragment2 != null) {
                        fragmentTransactionAdd.remove(requestManagerFragment2);
                    }
                    fragmentTransactionAdd.commitAllowingStateLoss();
                    handler.obtainMessage(1, 1, 0, fragmentManager2).sendToTarget();
                    if (Log.isLoggable("RMRetriever", 3)) {
                        Log.d("RMRetriever", "We failed to add our Fragment the first time around, trying again...");
                    }
                    z3 = true;
                    z2 = false;
                    obj2 = null;
                }
            }
            objRemove = map2.remove(fragmentManager2);
            obj = fragmentManager2;
            z3 = true;
            obj2 = obj;
        }
        if (Log.isLoggable("RMRetriever", 5) && z2 && objRemove == null) {
            Log.w("RMRetriever", "Failed to remove expected request manager fragment, manager: " + obj2);
        }
        return z3;
    }
}
