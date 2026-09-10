package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class yf implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Application f22220b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WeakReference f22221c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22219a = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f22222d = false;

    public yf(Application application, kg kgVar) {
        this.f22221c = new WeakReference(kgVar);
        this.f22220b = application;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        int i10 = this.f22219a;
        Application application = this.f22220b;
        WeakReference weakReference = this.f22221c;
        switch (i10) {
            case 0:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) weakReference.get();
                    if (activityLifecycleCallbacks != null) {
                        activityLifecycleCallbacks.onActivityCreated(activity, bundle);
                    } else if (!this.f22222d) {
                        application.unregisterActivityLifecycleCallbacks(this);
                        this.f22222d = true;
                    }
                } catch (Exception unused) {
                    return;
                }
                break;
            default:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks2 = (Application.ActivityLifecycleCallbacks) weakReference.get();
                    if (activityLifecycleCallbacks2 != null) {
                        activityLifecycleCallbacks2.onActivityCreated(activity, bundle);
                    } else if (!this.f22222d) {
                        application.unregisterActivityLifecycleCallbacks(this);
                        this.f22222d = true;
                    }
                } catch (Exception e10) {
                    int i11 = zze.zza;
                    zzo.zzg("Error while dispatching lifecycle callback.", e10);
                    return;
                }
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        int i10 = this.f22219a;
        Application application = this.f22220b;
        WeakReference weakReference = this.f22221c;
        switch (i10) {
            case 0:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) weakReference.get();
                    if (activityLifecycleCallbacks != null) {
                        activityLifecycleCallbacks.onActivityDestroyed(activity);
                    } else if (!this.f22222d) {
                        application.unregisterActivityLifecycleCallbacks(this);
                        this.f22222d = true;
                    }
                } catch (Exception unused) {
                    return;
                }
                break;
            default:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks2 = (Application.ActivityLifecycleCallbacks) weakReference.get();
                    if (activityLifecycleCallbacks2 != null) {
                        activityLifecycleCallbacks2.onActivityDestroyed(activity);
                    } else if (!this.f22222d) {
                        application.unregisterActivityLifecycleCallbacks(this);
                        this.f22222d = true;
                    }
                } catch (Exception e10) {
                    int i11 = zze.zza;
                    zzo.zzg("Error while dispatching lifecycle callback.", e10);
                    return;
                }
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        int i10 = this.f22219a;
        Application application = this.f22220b;
        WeakReference weakReference = this.f22221c;
        switch (i10) {
            case 0:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) weakReference.get();
                    if (activityLifecycleCallbacks != null) {
                        activityLifecycleCallbacks.onActivityPaused(activity);
                    } else if (!this.f22222d) {
                        application.unregisterActivityLifecycleCallbacks(this);
                        this.f22222d = true;
                    }
                } catch (Exception unused) {
                    return;
                }
                break;
            default:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks2 = (Application.ActivityLifecycleCallbacks) weakReference.get();
                    if (activityLifecycleCallbacks2 != null) {
                        activityLifecycleCallbacks2.onActivityPaused(activity);
                    } else if (!this.f22222d) {
                        application.unregisterActivityLifecycleCallbacks(this);
                        this.f22222d = true;
                    }
                } catch (Exception e10) {
                    int i11 = zze.zza;
                    zzo.zzg("Error while dispatching lifecycle callback.", e10);
                    return;
                }
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        int i10 = this.f22219a;
        Application application = this.f22220b;
        WeakReference weakReference = this.f22221c;
        switch (i10) {
            case 0:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) weakReference.get();
                    if (activityLifecycleCallbacks != null) {
                        activityLifecycleCallbacks.onActivityResumed(activity);
                    } else if (!this.f22222d) {
                        application.unregisterActivityLifecycleCallbacks(this);
                        this.f22222d = true;
                    }
                } catch (Exception unused) {
                    return;
                }
                break;
            default:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks2 = (Application.ActivityLifecycleCallbacks) weakReference.get();
                    if (activityLifecycleCallbacks2 != null) {
                        activityLifecycleCallbacks2.onActivityResumed(activity);
                    } else if (!this.f22222d) {
                        application.unregisterActivityLifecycleCallbacks(this);
                        this.f22222d = true;
                    }
                } catch (Exception e10) {
                    int i11 = zze.zza;
                    zzo.zzg("Error while dispatching lifecycle callback.", e10);
                    return;
                }
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        int i10 = this.f22219a;
        Application application = this.f22220b;
        WeakReference weakReference = this.f22221c;
        switch (i10) {
            case 0:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) weakReference.get();
                    if (activityLifecycleCallbacks != null) {
                        activityLifecycleCallbacks.onActivitySaveInstanceState(activity, bundle);
                    } else if (!this.f22222d) {
                        application.unregisterActivityLifecycleCallbacks(this);
                        this.f22222d = true;
                    }
                } catch (Exception unused) {
                    return;
                }
                break;
            default:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks2 = (Application.ActivityLifecycleCallbacks) weakReference.get();
                    if (activityLifecycleCallbacks2 != null) {
                        activityLifecycleCallbacks2.onActivitySaveInstanceState(activity, bundle);
                    } else if (!this.f22222d) {
                        application.unregisterActivityLifecycleCallbacks(this);
                        this.f22222d = true;
                    }
                } catch (Exception e10) {
                    int i11 = zze.zza;
                    zzo.zzg("Error while dispatching lifecycle callback.", e10);
                    return;
                }
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        int i10 = this.f22219a;
        Application application = this.f22220b;
        WeakReference weakReference = this.f22221c;
        switch (i10) {
            case 0:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) weakReference.get();
                    if (activityLifecycleCallbacks != null) {
                        activityLifecycleCallbacks.onActivityStarted(activity);
                    } else if (!this.f22222d) {
                        application.unregisterActivityLifecycleCallbacks(this);
                        this.f22222d = true;
                    }
                } catch (Exception unused) {
                    return;
                }
                break;
            default:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks2 = (Application.ActivityLifecycleCallbacks) weakReference.get();
                    if (activityLifecycleCallbacks2 != null) {
                        activityLifecycleCallbacks2.onActivityStarted(activity);
                    } else if (!this.f22222d) {
                        application.unregisterActivityLifecycleCallbacks(this);
                        this.f22222d = true;
                    }
                } catch (Exception e10) {
                    int i11 = zze.zza;
                    zzo.zzg("Error while dispatching lifecycle callback.", e10);
                    return;
                }
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        int i10 = this.f22219a;
        Application application = this.f22220b;
        WeakReference weakReference = this.f22221c;
        switch (i10) {
            case 0:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) weakReference.get();
                    if (activityLifecycleCallbacks != null) {
                        activityLifecycleCallbacks.onActivityStopped(activity);
                    } else if (!this.f22222d) {
                        application.unregisterActivityLifecycleCallbacks(this);
                        this.f22222d = true;
                    }
                } catch (Exception unused) {
                    return;
                }
                break;
            default:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks2 = (Application.ActivityLifecycleCallbacks) weakReference.get();
                    if (activityLifecycleCallbacks2 != null) {
                        activityLifecycleCallbacks2.onActivityStopped(activity);
                    } else if (!this.f22222d) {
                        application.unregisterActivityLifecycleCallbacks(this);
                        this.f22222d = true;
                    }
                } catch (Exception e10) {
                    int i11 = zze.zza;
                    zzo.zzg("Error while dispatching lifecycle callback.", e10);
                    return;
                }
                break;
        }
    }

    public yf(Application application, bi biVar) {
        this.f22221c = new WeakReference(biVar);
        this.f22220b = application;
    }
}
