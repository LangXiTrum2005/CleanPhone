package p;

import android.R;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AbsSeekBar;
import android.widget.EditText;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class b0 implements v0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f47620d = {R.attr.indeterminateDrawable, R.attr.progressDrawable};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f47621a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f47622b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f47623c;

    public b0(AbsSeekBar absSeekBar) {
        this.f47621a = 0;
        this.f47622b = absSeekBar;
    }

    @Override // p.v0
    public void a(int i10) {
        super/*android.widget.TextView*/.setLastBaselineToBottomHeight(i10);
    }

    @Override // p.v0
    public void c(int i10) {
        super/*android.widget.TextView*/.setFirstBaselineToTopHeight(i10);
    }

    public KeyListener d(KeyListener keyListener) {
        if (keyListener instanceof NumberKeyListener) {
            return keyListener;
        }
        ((wi.b) ((qj.x) this.f47623c).f49096b).getClass();
        if (keyListener instanceof z0.e) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        return keyListener instanceof NumberKeyListener ? keyListener : new z0.e(keyListener);
    }

    public void e(AttributeSet attributeSet, int i10) {
        switch (this.f47621a) {
            case 0:
                AbsSeekBar absSeekBar = (AbsSeekBar) this.f47622b;
                g9.k kVarZ = g9.k.z(absSeekBar.getContext(), attributeSet, f47620d, i10);
                Drawable drawableT = kVarZ.t(0);
                if (drawableT != null) {
                    if (drawableT instanceof AnimationDrawable) {
                        AnimationDrawable animationDrawable = (AnimationDrawable) drawableT;
                        int numberOfFrames = animationDrawable.getNumberOfFrames();
                        AnimationDrawable animationDrawable2 = new AnimationDrawable();
                        animationDrawable2.setOneShot(animationDrawable.isOneShot());
                        for (int i11 = 0; i11 < numberOfFrames; i11++) {
                            Drawable drawableH = h(animationDrawable.getFrame(i11), true);
                            drawableH.setLevel(10000);
                            animationDrawable2.addFrame(drawableH, animationDrawable.getDuration(i11));
                        }
                        animationDrawable2.setLevel(10000);
                        drawableT = animationDrawable2;
                    }
                    absSeekBar.setIndeterminateDrawable(drawableT);
                }
                Drawable drawableT2 = kVarZ.t(1);
                if (drawableT2 != null) {
                    absSeekBar.setProgressDrawable(h(drawableT2, false));
                }
                kVarZ.B();
                return;
            default:
                TypedArray typedArrayObtainStyledAttributes = ((EditText) this.f47622b).getContext().obtainStyledAttributes(attributeSet, j.a.f43525i, i10, 0);
                try {
                    boolean z10 = true;
                    if (typedArrayObtainStyledAttributes.hasValue(14)) {
                        z10 = typedArrayObtainStyledAttributes.getBoolean(14, true);
                        break;
                    }
                    typedArrayObtainStyledAttributes.recycle();
                    g(z10);
                    return;
                } catch (Throwable th2) {
                    typedArrayObtainStyledAttributes.recycle();
                    throw th2;
                }
        }
    }

    public z0.b f(InputConnection inputConnection, EditorInfo editorInfo) {
        qj.x xVar = (qj.x) this.f47623c;
        if (inputConnection == null) {
            xVar.getClass();
            inputConnection = null;
        } else {
            wi.b bVar = (wi.b) xVar.f49096b;
            bVar.getClass();
            if (!(inputConnection instanceof z0.b)) {
                inputConnection = new z0.b((EditText) bVar.f53211a, inputConnection, editorInfo);
            }
        }
        return (z0.b) inputConnection;
    }

    public void g(boolean z10) {
        z0.h hVar = (z0.h) ((wi.b) ((qj.x) this.f47623c).f49096b).f53212b;
        if (hVar.f54614c != z10) {
            if (hVar.f54613b != null) {
                x0.g gVarA = x0.g.a();
                m2 m2Var = hVar.f54613b;
                gVarA.getClass();
                com.google.android.gms.internal.play_billing.q1.e(m2Var, "initCallback cannot be null");
                ReentrantReadWriteLock reentrantReadWriteLock = gVarA.f53515a;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    gVarA.f53516b.remove(m2Var);
                    reentrantReadWriteLock.writeLock().unlock();
                } catch (Throwable th2) {
                    reentrantReadWriteLock.writeLock().unlock();
                    throw th2;
                }
            }
            hVar.f54614c = z10;
            if (z10) {
                z0.h.a(hVar.f54612a, x0.g.a().b());
            }
        }
    }

    public Drawable h(Drawable drawable, boolean z10) {
        if (!(drawable instanceof LayerDrawable)) {
            if (!(drawable instanceof BitmapDrawable)) {
                return drawable;
            }
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            Bitmap bitmap = bitmapDrawable.getBitmap();
            if (((Bitmap) this.f47623c) == null) {
                this.f47623c = bitmap;
            }
            ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null));
            shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
            shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
            return z10 ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
        }
        LayerDrawable layerDrawable = (LayerDrawable) drawable;
        int numberOfLayers = layerDrawable.getNumberOfLayers();
        Drawable[] drawableArr = new Drawable[numberOfLayers];
        for (int i10 = 0; i10 < numberOfLayers; i10++) {
            int id2 = layerDrawable.getId(i10);
            drawableArr[i10] = h(layerDrawable.getDrawable(i10), id2 == 16908301 || id2 == 16908303);
        }
        LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
        for (int i11 = 0; i11 < numberOfLayers; i11++) {
            layerDrawable2.setId(i11, layerDrawable.getId(i11));
            layerDrawable2.setLayerGravity(i11, layerDrawable.getLayerGravity(i11));
            layerDrawable2.setLayerWidth(i11, layerDrawable.getLayerWidth(i11));
            layerDrawable2.setLayerHeight(i11, layerDrawable.getLayerHeight(i11));
            layerDrawable2.setLayerInsetLeft(i11, layerDrawable.getLayerInsetLeft(i11));
            layerDrawable2.setLayerInsetRight(i11, layerDrawable.getLayerInsetRight(i11));
            layerDrawable2.setLayerInsetTop(i11, layerDrawable.getLayerInsetTop(i11));
            layerDrawable2.setLayerInsetBottom(i11, layerDrawable.getLayerInsetBottom(i11));
            layerDrawable2.setLayerInsetStart(i11, layerDrawable.getLayerInsetStart(i11));
            layerDrawable2.setLayerInsetEnd(i11, layerDrawable.getLayerInsetEnd(i11));
        }
        return layerDrawable2;
    }

    public b0(EditText editText) {
        this.f47621a = 1;
        this.f47622b = editText;
        this.f47623c = new qj.x(editText);
    }

    public b0(x0 x0Var) {
        this.f47621a = 2;
        this.f47623c = x0Var;
        this.f47621a = 2;
        this.f47622b = x0Var;
    }

    @Override // p.v0
    public void b(int i10, float f10) {
    }
}
