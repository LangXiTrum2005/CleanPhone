package com.smartdigimkt.expressad.activity;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.Display;
import android.view.DisplayCutout;
import android.view.OrientationEventListener;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;

/* JADX INFO: loaded from: classes5.dex */
public abstract class ATBaseActivity extends Activity {
    private static final String e0 = "ATBaseActivity";
    private OrientationEventListener X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    private Display f34654Y;
    private int Z = -1;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            int safeInsetRight;
            int safeInsetTop;
            int safeInsetBottom;
            DisplayCutout displayCutout;
            int i2;
            try {
                int i3 = Build.VERSION.SDK_INT;
                WindowInsets rootWindowInsets = ATBaseActivity.this.getWindow().getDecorView().getRootWindowInsets();
                int i4 = -1;
                int i5 = 0;
                if (rootWindowInsets == null || i3 < 28 || (displayCutout = rootWindowInsets.getDisplayCutout()) == null) {
                    safeInsetRight = 0;
                    safeInsetTop = 0;
                    safeInsetBottom = 0;
                } else {
                    int safeInsetLeft = displayCutout.getSafeInsetLeft();
                    safeInsetRight = displayCutout.getSafeInsetRight();
                    safeInsetTop = displayCutout.getSafeInsetTop();
                    safeInsetBottom = displayCutout.getSafeInsetBottom();
                    int iC = ATBaseActivity.this.c();
                    if (ATBaseActivity.this.Z == -1) {
                        ATBaseActivity aTBaseActivity = ATBaseActivity.this;
                        if (iC == 0) {
                            i2 = 3;
                        } else if (iC == 1) {
                            i2 = 1;
                        } else if (iC == 2) {
                            i2 = 4;
                        } else {
                            i2 = iC == 3 ? 2 : -1;
                        }
                        aTBaseActivity.Z = i2;
                        int unused = ATBaseActivity.this.Z;
                    }
                    if (iC == 0) {
                        i4 = 0;
                    } else if (iC == 1) {
                        i4 = 90;
                    } else if (iC == 2) {
                        i4 = 180;
                    } else if (iC == 3) {
                        i4 = 270;
                    }
                    i5 = safeInsetLeft;
                }
                ATBaseActivity.this.a(i4, i5, safeInsetRight, safeInsetTop, safeInsetBottom);
                if (ATBaseActivity.this.X == null) {
                    ATBaseActivity.this.e();
                }
            } catch (Throwable th) {
                th.getMessage();
            }
        }
    }

    public class b extends OrientationEventListener {
        public b(Context context, int i2) {
            super(context, i2);
        }

        @Override // android.view.OrientationEventListener
        public void onOrientationChanged(int i2) {
            int iC = ATBaseActivity.this.c();
            if (iC < 0) {
                iC = 0;
            }
            if (iC == 1 && ATBaseActivity.this.Z != 1) {
                ATBaseActivity.this.Z = 1;
                ATBaseActivity.this.b();
                return;
            }
            if (iC == 3 && ATBaseActivity.this.Z != 2) {
                ATBaseActivity.this.Z = 2;
                ATBaseActivity.this.b();
            } else if (iC == 0 && ATBaseActivity.this.Z != 3) {
                ATBaseActivity.this.Z = 3;
                ATBaseActivity.this.b();
            } else {
                if (iC != 2 || ATBaseActivity.this.Z == 4) {
                    return;
                }
                ATBaseActivity.this.Z = 4;
                ATBaseActivity.this.b();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        b bVar = new b(this, 1);
        this.X = bVar;
        if (bVar.canDetectOrientation()) {
            this.X.enable();
        } else {
            this.X.disable();
            this.X = null;
        }
    }

    public abstract void a(int i2, int i3, int i4, int i5, int i6);

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        int i2;
        super.onCreate(bundle);
        try {
            requestWindowFeature(1);
            getWindow().setFlags(1024, 1024);
            getWindow().addFlags(512);
            d();
            c();
            Window window = getWindow();
            if (window == null || (i2 = Build.VERSION.SDK_INT) < 28) {
                return;
            }
            WindowManager.LayoutParams attributes = window.getAttributes();
            if (i2 >= 30) {
                attributes.layoutInDisplayCutoutMode = 3;
            } else {
                attributes.layoutInDisplayCutoutMode = 1;
            }
            window.setAttributes(attributes);
        } catch (Exception e2) {
            e2.getMessage();
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        OrientationEventListener orientationEventListener = this.X;
        if (orientationEventListener != null) {
            orientationEventListener.disable();
            this.X = null;
        }
    }

    @Override // android.app.Activity
    public void onResume() {
        if (Build.VERSION.SDK_INT < 29) {
            try {
                super.onResume();
            } catch (Throwable unused) {
                a();
            }
        } else {
            super.onResume();
        }
        if (com.smartdigimkt.z.b.f) {
            return;
        }
        b();
        d();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z2) {
        super.onWindowFocusChanged(z2);
        d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int c() {
        if (this.f34654Y == null) {
            if (Build.VERSION.SDK_INT >= 30) {
                this.f34654Y = getDisplay();
            } else {
                this.f34654Y = ((WindowManager) getSystemService("window")).getDefaultDisplay();
            }
        }
        Display display = this.f34654Y;
        if (display == null) {
            return -1;
        }
        try {
            return display.getRotation();
        } catch (Throwable unused) {
            return -1;
        }
    }

    private void d() {
        try {
            getWindow().addFlags(67108864);
            getWindow().getDecorView().setSystemUiVisibility(4098);
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public void b() {
        getWindow().getDecorView().postDelayed(new a(), 500L);
    }

    public void a() {
        try {
            finish();
        } catch (Throwable unused) {
        }
    }
}
