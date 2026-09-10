package com.thinkup.nativead.api;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.thinkup.core.common.n.o0n;
import com.thinkup.core.common.res.m;
import com.thinkup.core.common.res.oo;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes6.dex */
public class TUNativeImageView extends ImageView {
    public static final String TAG = "tpn_thinkup_native_image";
    private WeakReference<TUNativeImageView> imageViewWeakReference;
    String mImageUrl;
    private int retryCurCount;
    private int retryDelay;
    private int retryMaxCount;
    private Runnable retryRunnable;

    public class o implements Runnable {
        int height;
        String url;
        int width;

        public o(String str, int i2, int i3) {
            this.url = str;
            this.width = i2;
            this.height = i3;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                TUNativeImageView.this.loadImage(this.url, this.width, this.height);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public TUNativeImageView(Context context) {
        super(context);
        this.retryMaxCount = 3;
        this.retryCurCount = 0;
        this.retryDelay = 500;
    }

    public static /* synthetic */ int access$208(TUNativeImageView tUNativeImageView) {
        int i2 = tUNativeImageView.retryCurCount;
        tUNativeImageView.retryCurCount = i2 + 1;
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void loadImage(String str, final int i2, final int i3) {
        m.o(getContext()).o(new oo(2, str), i2, i3, new m.o() { // from class: com.thinkup.nativead.api.TUNativeImageView.1
            @Override // com.thinkup.core.common.res.m.o
            public final void onFail(String str2, String str3) {
                Log.e(TUNativeImageView.TAG, "curRetryCount=" + TUNativeImageView.this.retryCurCount + ", load: image load fail:" + str3);
                try {
                    TUNativeImageView.access$208(TUNativeImageView.this);
                    if (TUNativeImageView.this.retryCurCount > TUNativeImageView.this.retryMaxCount) {
                        TUNativeImageView.this.printLog("meet retry count, stop retry: ".concat(String.valueOf(str2)));
                        return;
                    }
                    TUNativeImageView tUNativeImageView = TUNativeImageView.this;
                    tUNativeImageView.retryRunnable = tUNativeImageView.new o(str2, i2, i3);
                    o0n.m().o(TUNativeImageView.this.retryRunnable, TUNativeImageView.this.retryDelay);
                } catch (Throwable th) {
                    Log.e(TUNativeImageView.TAG, "onFail error: ", th);
                }
            }

            @Override // com.thinkup.core.common.res.m.o
            public final void onSuccess(String str2, Bitmap bitmap) {
                try {
                    if (TUNativeImageView.this.retryRunnable != null) {
                        o0n.m().o0(TUNativeImageView.this.retryRunnable);
                    }
                    TUNativeImageView.this.printLog("curRetryCount=" + TUNativeImageView.this.retryCurCount + ", load success: " + str2);
                    TUNativeImageView tUNativeImageView = (TUNativeImageView) TUNativeImageView.this.imageViewWeakReference.get();
                    if (!TextUtils.equals(TUNativeImageView.this.mImageUrl, str2) || tUNativeImageView == null) {
                        TUNativeImageView.this.printLog("curRetryCount=" + TUNativeImageView.this.retryCurCount + ", failed to set Image to [" + tUNativeImageView + "], url: " + str2);
                        return;
                    }
                    TUNativeImageView.this.printLog("curRetryCount=" + TUNativeImageView.this.retryCurCount + ", set Image to [" + tUNativeImageView + "], url: " + str2);
                    tUNativeImageView.setImageBitmap(bitmap);
                } catch (Throwable th) {
                    Log.e(TUNativeImageView.TAG, "onSuccess error: ", th);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void printLog(String str) {
        if (o0n.m().m0o()) {
            Log.i(TAG, str);
        }
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        try {
            super.dispatchDraw(canvas);
        } catch (Throwable unused) {
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        try {
            super.onDraw(canvas);
        } catch (Throwable unused) {
        }
    }

    public void setImage(String str, int i2, int i3) {
        if (TextUtils.isEmpty(str)) {
            Log.e(TAG, "load: url is empty!");
            return;
        }
        this.mImageUrl = str;
        this.imageViewWeakReference = new WeakReference<>(this);
        this.retryCurCount = 0;
        loadImage(str, i2, i3);
    }

    public void setRetryDelay(int i2) {
        printLog("setRetryDelay: retryDelay=" + this.retryMaxCount);
        if (this.retryMaxCount <= 200) {
            return;
        }
        this.retryDelay = i2;
    }

    public void setRetryMaxCount(int i2) {
        printLog("setRetryMaxCount: retryMaxCount=".concat(String.valueOf(i2)));
        if (i2 <= 0) {
            return;
        }
        this.retryMaxCount = i2;
    }

    public TUNativeImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.retryMaxCount = 3;
        this.retryCurCount = 0;
        this.retryDelay = 500;
    }

    public void setImage(String str) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            setImage(str, layoutParams.width, layoutParams.height);
        } else {
            setImage(str, -1, -1);
        }
    }

    public TUNativeImageView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.retryMaxCount = 3;
        this.retryCurCount = 0;
        this.retryDelay = 500;
    }
}
