package org.greenrobot.eventbus.android;

/* JADX INFO: loaded from: classes7.dex */
public abstract class AndroidComponents {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AndroidComponents f45276c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AndroidLogger f45277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DefaultAndroidMainThreadSupport f45278b;

    static {
        AndroidComponents androidComponents = null;
        if (AndroidDependenciesDetector.a()) {
            try {
                androidComponents = (AndroidComponents) AndroidComponentsImpl.class.getConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (Throwable unused) {
            }
        }
        f45276c = androidComponents;
    }

    public AndroidComponents(AndroidLogger androidLogger, DefaultAndroidMainThreadSupport defaultAndroidMainThreadSupport) {
        this.f45277a = androidLogger;
        this.f45278b = defaultAndroidMainThreadSupport;
    }
}
