package com.bumptech.glide;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ImageView;
import androidx.collection.ArrayMap;
import com.bumptech.glide.load.resource.bitmap.CenterCrop;
import com.bumptech.glide.load.resource.bitmap.CenterInside;
import com.bumptech.glide.load.resource.bitmap.DownsampleStrategy;
import com.bumptech.glide.load.resource.bitmap.FitCenter;
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions;
import com.bumptech.glide.manager.RequestTracker;
import com.bumptech.glide.request.BaseRequestOptions;
import com.bumptech.glide.request.ErrorRequestCoordinator;
import com.bumptech.glide.request.Request;
import com.bumptech.glide.request.RequestCoordinator;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.RequestOptions;
import com.bumptech.glide.request.SingleRequest;
import com.bumptech.glide.request.ThumbnailRequestCoordinator;
import com.bumptech.glide.request.target.BitmapImageViewTarget;
import com.bumptech.glide.request.target.DrawableImageViewTarget;
import com.bumptech.glide.request.target.Target;
import com.bumptech.glide.util.Preconditions;
import com.bumptech.glide.util.Util;
import com.p004ironsource.mediationsdk.metadata.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class RequestBuilder<TranscodeType> extends BaseRequestOptions<RequestBuilder<TranscodeType>> implements Cloneable, ModelTypes<RequestBuilder<TranscodeType>> {
    public boolean A0;
    public boolean B0;
    public final Context q0;
    public final RequestManager r0;
    public final Class s0;
    public final GlideContext t0;
    public TransitionOptions u0;
    public Object v0;
    public ArrayList w0;
    public RequestBuilder x0;
    public RequestBuilder y0;
    public boolean z0 = true;

    /* JADX INFO: renamed from: com.bumptech.glide.RequestBuilder$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f12310a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f12311b;

        static {
            int[] iArr = new int[Priority.values().length];
            f12311b = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12311b[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f12311b[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f12311b[0] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[ImageView.ScaleType.values().length];
            f12310a = iArr2;
            try {
                iArr2[ImageView.ScaleType.CENTER_CROP.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f12310a[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f12310a[ImageView.ScaleType.FIT_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f12310a[ImageView.ScaleType.FIT_START.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f12310a[ImageView.ScaleType.FIT_END.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f12310a[ImageView.ScaleType.FIT_XY.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f12310a[ImageView.ScaleType.CENTER.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f12310a[ImageView.ScaleType.MATRIX.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    static {
    }

    public RequestBuilder(Glide glide, RequestManager requestManager, Class cls, Context context) {
        RequestOptions requestOptions;
        this.r0 = requestManager;
        this.s0 = cls;
        this.q0 = context;
        ArrayMap arrayMap = requestManager.X.Z.f;
        TransitionOptions transitionOptions = (TransitionOptions) arrayMap.get(cls);
        if (transitionOptions == null) {
            for (Map.Entry entry : arrayMap.entrySet()) {
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    transitionOptions = (TransitionOptions) entry.getValue();
                }
            }
        }
        this.u0 = transitionOptions == null ? GlideContext.k : transitionOptions;
        this.t0 = glide.Z;
        Iterator it = requestManager.j0.iterator();
        while (it.hasNext()) {
            t((RequestListener) it.next());
        }
        synchronized (requestManager) {
            requestOptions = requestManager.k0;
        }
        b(requestOptions);
    }

    public final RequestBuilder A(Object obj) {
        if (this.n0) {
            return clone().A(obj);
        }
        this.v0 = obj;
        this.A0 = true;
        j();
        return this;
    }

    public final RequestBuilder B(DrawableTransitionOptions drawableTransitionOptions) {
        if (this.n0) {
            return clone().B(drawableTransitionOptions);
        }
        this.u0 = drawableTransitionOptions;
        this.z0 = false;
        j();
        return this;
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    public final boolean equals(Object obj) {
        if (!(obj instanceof RequestBuilder)) {
            return false;
        }
        RequestBuilder requestBuilder = (RequestBuilder) obj;
        if (super.equals(requestBuilder)) {
            return Objects.equals(this.s0, requestBuilder.s0) && this.u0.equals(requestBuilder.u0) && Objects.equals(this.v0, requestBuilder.v0) && Objects.equals(this.w0, requestBuilder.w0) && Objects.equals(this.x0, requestBuilder.x0) && Objects.equals(this.y0, requestBuilder.y0) && this.z0 == requestBuilder.z0 && this.A0 == requestBuilder.A0;
        }
        return false;
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    public final int hashCode() {
        return Util.h(this.A0 ? 1 : 0, Util.h(this.z0 ? 1 : 0, Util.i(Util.i(Util.i(Util.i(Util.i(Util.i(Util.i(super.hashCode(), this.s0), this.u0), this.v0), this.w0), this.x0), this.y0), null)));
    }

    public final RequestBuilder t(RequestListener requestListener) {
        if (this.n0) {
            return clone().t(requestListener);
        }
        if (requestListener != null) {
            if (this.w0 == null) {
                this.w0 = new ArrayList();
            }
            this.w0.add(requestListener);
        }
        j();
        return this;
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public final RequestBuilder b(BaseRequestOptions baseRequestOptions) {
        Preconditions.b(baseRequestOptions);
        return (RequestBuilder) super.b(baseRequestOptions);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final Request v(Object obj, Target target, RequestCoordinator requestCoordinator, TransitionOptions transitionOptions, Priority priority, int i2, int i3, BaseRequestOptions baseRequestOptions) {
        RequestCoordinator requestCoordinator2;
        RequestCoordinator errorRequestCoordinator;
        BaseRequestOptions baseRequestOptions2;
        Request singleRequest;
        Priority priority2;
        if (this.y0 != null) {
            errorRequestCoordinator = new ErrorRequestCoordinator(obj, requestCoordinator);
            requestCoordinator2 = errorRequestCoordinator;
        } else {
            requestCoordinator2 = null;
            errorRequestCoordinator = requestCoordinator;
        }
        RequestBuilder requestBuilder = this.x0;
        if (requestBuilder == null) {
            Object obj2 = this.v0;
            ArrayList arrayList = this.w0;
            GlideContext glideContext = this.t0;
            baseRequestOptions2 = baseRequestOptions;
            singleRequest = new SingleRequest(this.q0, glideContext, obj, obj2, this.s0, baseRequestOptions2, i2, i3, priority, target, arrayList, errorRequestCoordinator, glideContext.g, transitionOptions.X);
        } else {
            if (this.B0) {
                throw new IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
            }
            TransitionOptions transitionOptions2 = requestBuilder.z0 ? transitionOptions : requestBuilder.u0;
            if (BaseRequestOptions.f(requestBuilder.X, 8)) {
                priority2 = this.x0.Z;
            } else {
                int iOrdinal = priority.ordinal();
                if (iOrdinal == 0 || iOrdinal == 1) {
                    priority2 = Priority.X;
                } else if (iOrdinal == 2) {
                    priority2 = Priority.f12300Y;
                } else {
                    if (iOrdinal != 3) {
                        throw new IllegalArgumentException("unknown priority: " + this.Z);
                    }
                    priority2 = Priority.Z;
                }
            }
            Priority priority3 = priority2;
            RequestBuilder requestBuilder2 = this.x0;
            int i4 = requestBuilder2.g0;
            int i5 = requestBuilder2.f0;
            if (Util.j(i2, i3)) {
                RequestBuilder requestBuilder3 = this.x0;
                if (!Util.j(requestBuilder3.g0, requestBuilder3.f0)) {
                    i4 = baseRequestOptions.g0;
                    i5 = baseRequestOptions.f0;
                }
            }
            int i6 = i5;
            int i7 = i4;
            ThumbnailRequestCoordinator thumbnailRequestCoordinator = new ThumbnailRequestCoordinator(obj, errorRequestCoordinator);
            Object obj3 = this.v0;
            ArrayList arrayList2 = this.w0;
            ThumbnailRequestCoordinator thumbnailRequestCoordinator2 = thumbnailRequestCoordinator;
            GlideContext glideContext2 = this.t0;
            SingleRequest singleRequest2 = new SingleRequest(this.q0, glideContext2, obj, obj3, this.s0, baseRequestOptions, i2, i3, priority, target, arrayList2, thumbnailRequestCoordinator2, glideContext2.g, transitionOptions.X);
            this.B0 = true;
            RequestBuilder requestBuilder4 = this.x0;
            Request requestV = requestBuilder4.v(obj, target, thumbnailRequestCoordinator2, transitionOptions2, priority3, i7, i6, requestBuilder4);
            this.B0 = false;
            thumbnailRequestCoordinator2.f12811c = singleRequest2;
            thumbnailRequestCoordinator2.d = requestV;
            baseRequestOptions2 = baseRequestOptions;
            singleRequest = thumbnailRequestCoordinator2;
        }
        if (requestCoordinator2 == null) {
            return singleRequest;
        }
        RequestBuilder requestBuilder5 = this.y0;
        int i8 = requestBuilder5.g0;
        int i9 = requestBuilder5.f0;
        if (Util.j(i2, i3)) {
            RequestBuilder requestBuilder6 = this.y0;
            if (!Util.j(requestBuilder6.g0, requestBuilder6.f0)) {
                i8 = baseRequestOptions2.g0;
                i9 = baseRequestOptions2.f0;
            }
        }
        int i10 = i9;
        RequestBuilder requestBuilder7 = this.y0;
        ErrorRequestCoordinator errorRequestCoordinator2 = requestCoordinator2;
        Request requestV2 = requestBuilder7.v(obj, target, errorRequestCoordinator2, requestBuilder7.u0, requestBuilder7.Z, i8, i10, requestBuilder7);
        errorRequestCoordinator2.f12790c = singleRequest;
        errorRequestCoordinator2.d = requestV2;
        return errorRequestCoordinator2;
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public final RequestBuilder clone() {
        RequestBuilder requestBuilder = (RequestBuilder) super.clone();
        requestBuilder.u0 = requestBuilder.u0.clone();
        if (requestBuilder.w0 != null) {
            requestBuilder.w0 = new ArrayList(requestBuilder.w0);
        }
        RequestBuilder requestBuilder2 = requestBuilder.x0;
        if (requestBuilder2 != null) {
            requestBuilder.x0 = requestBuilder2.clone();
        }
        RequestBuilder requestBuilder3 = requestBuilder.y0;
        if (requestBuilder3 != null) {
            requestBuilder.y0 = requestBuilder3.clone();
        }
        return requestBuilder;
    }

    public final void x(ImageView imageView) {
        BaseRequestOptions baseRequestOptionsG;
        Target drawableImageViewTarget;
        Util.a();
        Preconditions.b(imageView);
        if (!BaseRequestOptions.f(this.X, a.f25965n) && imageView.getScaleType() != null) {
            switch (AnonymousClass1.f12310a[imageView.getScaleType().ordinal()]) {
                case 1:
                    baseRequestOptionsG = clone().g(DownsampleStrategy.f12652c, new CenterCrop());
                    break;
                case 2:
                    baseRequestOptionsG = clone().g(DownsampleStrategy.f12651b, new CenterInside());
                    baseRequestOptionsG.o0 = true;
                    break;
                case 3:
                case 4:
                case 5:
                    baseRequestOptionsG = clone().g(DownsampleStrategy.f12650a, new FitCenter());
                    baseRequestOptionsG.o0 = true;
                    break;
                case 6:
                    baseRequestOptionsG = clone().g(DownsampleStrategy.f12651b, new CenterInside());
                    baseRequestOptionsG.o0 = true;
                    break;
                default:
                    baseRequestOptionsG = this;
                    break;
            }
        } else {
            baseRequestOptionsG = this;
        }
        this.t0.f12293c.getClass();
        Class cls = this.s0;
        if (Bitmap.class.equals(cls)) {
            drawableImageViewTarget = new BitmapImageViewTarget(imageView);
        } else {
            if (!Drawable.class.isAssignableFrom(cls)) {
                throw new IllegalArgumentException("Unhandled class: " + cls + ", try .as*(Class).transcode(ResourceTranscoder)");
            }
            drawableImageViewTarget = new DrawableImageViewTarget(imageView);
        }
        y(drawableImageViewTarget, baseRequestOptionsG);
    }

    public final void y(Target target, BaseRequestOptions baseRequestOptions) {
        Preconditions.b(target);
        if (!this.A0) {
            throw new IllegalArgumentException("You must call #load() before calling #into()");
        }
        Request requestV = v(new Object(), target, null, this.u0, baseRequestOptions.Z, baseRequestOptions.g0, baseRequestOptions.f0, baseRequestOptions);
        Request requestE = target.e();
        if (requestV.g(requestE) && (baseRequestOptions.e0 || !requestE.e())) {
            Preconditions.c(requestE, "Argument must not be null");
            if (requestE.isRunning()) {
                return;
            }
            requestE.h();
            return;
        }
        this.r0.b(target);
        target.i(requestV);
        RequestManager requestManager = this.r0;
        synchronized (requestManager) {
            requestManager.g0.X.add(target);
            RequestTracker requestTracker = requestManager.e0;
            requestTracker.f12755a.add(requestV);
            if (requestTracker.f12757c) {
                requestV.clear();
                if (Log.isLoggable("RequestTracker", 2)) {
                    Log.v("RequestTracker", "Paused, delaying request");
                }
                requestTracker.f12756b.add(requestV);
            } else {
                requestV.h();
            }
        }
    }

    public final RequestBuilder z(RequestListener requestListener) {
        if (this.n0) {
            return clone().z(requestListener);
        }
        this.w0 = null;
        return t(requestListener);
    }
}
