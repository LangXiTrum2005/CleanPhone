package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.NinePatch;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.umeng.analytics.pro.f;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.databinding.DialogShakeSensitivityBinding;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3375el;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4740uI;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.WW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Y50;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Z50;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public final class LinerCustomSeekBar extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Drawable f5358a;
    public Drawable b;
    public Drawable c;
    public float d;
    public int e;
    public final int f;
    public TextView g;
    public boolean h;
    public float i;
    public InterfaceC4740uI j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinerCustomSeekBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC2995aW.q(context, f.X);
        new Paint(1);
        new Paint(1);
        new Paint(1);
        this.e = 100;
        this.f = 100;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, WW.c);
            AbstractC2995aW.p(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
            this.f5358a = typedArrayObtainStyledAttributes.getDrawable(0);
            this.b = typedArrayObtainStyledAttributes.getDrawable(1);
            this.c = typedArrayObtainStyledAttributes.getDrawable(3);
            this.e = typedArrayObtainStyledAttributes.getInteger(2, 100);
            typedArrayObtainStyledAttributes.recycle();
        }
        Drawable drawable = this.c;
        if (drawable != null) {
            drawable.getIntrinsicWidth();
        }
    }

    public static void a(Canvas canvas, Drawable drawable, float f, float f2) {
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            if (bitmapDrawable.getBitmap() != null) {
                byte[] ninePatchChunk = bitmapDrawable.getBitmap().getNinePatchChunk();
                if (ninePatchChunk != null && NinePatch.isNinePatchChunk(ninePatchChunk)) {
                    int i = (int) 0.0f;
                    new NinePatch(bitmapDrawable.getBitmap(), ninePatchChunk, null).draw(canvas, new Rect(i, i, (int) f, (int) f2), null);
                    return;
                } else {
                    int i2 = (int) 0.0f;
                    drawable.setBounds(i2, i2, (int) f, (int) f2);
                    drawable.draw(canvas);
                    return;
                }
            }
        }
        int i3 = (int) 0.0f;
        drawable.setBounds(i3, i3, (int) f, (int) f2);
        drawable.draw(canvas);
    }

    private final void setProgress(float f) {
        InterfaceC4740uI interfaceC4740uI = this.j;
        if (interfaceC4740uI != null) {
            int i = (int) this.d;
            Z50 z50 = ((Y50) interfaceC4740uI).f4005a;
            ((DialogShakeSensitivityBinding) z50.a()).ivShake.setSelected(i == 0);
            ((DialogShakeSensitivityBinding) z50.a()).tvMaxSensitivity.setText(String.valueOf(i));
        }
        this.d = f;
    }

    public final int getMaxProgress() {
        return this.e;
    }

    public final int getProgress() {
        return (int) this.d;
    }

    public final boolean getSeekBarIsTouching() {
        return this.h;
    }

    public final int getStreamMusicProgress() {
        return this.f;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        AbstractC2995aW.q(canvas, "canvas");
        super.onDraw(canvas);
        Drawable drawable = this.f5358a;
        if (drawable != null) {
            a(canvas, drawable, getWidth(), getHeight());
        }
        Drawable drawable2 = this.b;
        if (drawable2 != null) {
            float width = (this.d / this.e) * getWidth();
            canvas.save();
            canvas.clipRect(0.0f, 0.0f, width, getHeight());
            a(canvas, drawable2, getWidth(), getHeight());
            canvas.restore();
        }
        Drawable drawable3 = this.c;
        if (drawable3 != null) {
            float width2 = (this.d / this.e) * (getWidth() - drawable3.getIntrinsicWidth());
            int height = (getHeight() - drawable3.getIntrinsicHeight()) / 2;
            drawable3.setBounds((int) width2, height, (int) (width2 + drawable3.getIntrinsicWidth()), drawable3.getIntrinsicHeight() + height);
            drawable3.draw(canvas);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Drawable drawable = this.f5358a;
        int intrinsicWidth = drawable != null ? drawable.getIntrinsicWidth() : 0;
        Drawable drawable2 = this.f5358a;
        int intrinsicHeight = drawable2 != null ? drawable2.getIntrinsicHeight() : 0;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode == Integer.MIN_VALUE ? size <= intrinsicWidth : mode == 1073741824) {
            intrinsicWidth = size;
        }
        if (mode2 == Integer.MIN_VALUE ? size2 <= intrinsicHeight : mode2 == 1073741824) {
            intrinsicHeight = size2;
        }
        setMeasuredDimension(intrinsicWidth, intrinsicHeight);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        AbstractC2995aW.q(motionEvent, NotificationCompat.CATEGORY_EVENT);
        int action = motionEvent.getAction();
        if (action == 0) {
            this.i = motionEvent.getX();
            return true;
        }
        if (action == 1) {
            this.h = false;
            InterfaceC4740uI interfaceC4740uI = this.j;
            if (interfaceC4740uI != null) {
                ((Y50) interfaceC4740uI).a(this);
            }
            return true;
        }
        if (action != 2) {
            return super.onTouchEvent(motionEvent);
        }
        this.h = true;
        float x = motionEvent.getX() - this.i;
        this.i = motionEvent.getX();
        float width = x / getWidth();
        float f = this.e;
        setProgress(AbstractC3375el.o(this.d + (width * f), f));
        invalidate();
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        AbstractC2995aW.q(drawable, "drawable");
        this.f5358a = drawable;
        invalidate();
    }

    public final void setForegroundDrawable(Drawable drawable) {
        AbstractC2995aW.q(drawable, "drawable");
        this.b = drawable;
        invalidate();
    }

    public final void setMaxProgress(int i) {
        this.e = i;
        setProgress(AbstractC3375el.o(this.d, i));
        invalidate();
        TextView textView = this.g;
        if (textView != null) {
            textView.setText(String.format(Locale.getDefault(), "%.0f%%", Arrays.copyOf(new Object[]{Integer.valueOf(getProgress() * 200)}, 1)));
        }
    }

    public final void setOnProgressChangeListener(InterfaceC4740uI interfaceC4740uI) {
        AbstractC2995aW.q(interfaceC4740uI, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.j = interfaceC4740uI;
    }

    public final void setProgressByStreamVolume(int i) {
        setProgress(AbstractC3375el.p(i, 100));
        InterfaceC4740uI interfaceC4740uI = this.j;
        if (interfaceC4740uI != null) {
            ((Y50) interfaceC4740uI).a(this);
        }
        invalidate();
    }

    public final void setTextView(TextView textView) {
        AbstractC2995aW.q(textView, "textView");
        this.g = textView;
    }

    public final void setThumbDrawable(Drawable drawable) {
        AbstractC2995aW.q(drawable, "drawable");
        this.c = drawable;
        drawable.getIntrinsicWidth();
        drawable.getIntrinsicHeight();
        invalidate();
    }

    public final void setProgress(int i) {
        setProgress(AbstractC3375el.p(i, this.e));
        invalidate();
    }
}
