package com.badlogic.gdx.backends.android;

import android.view.ViewGroup;
import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.PolygonSpriteBatch;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.math.Matrix4;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.BooleanArray;
import com.badlogic.gdx.utils.FloatArray;
import com.badlogic.gdx.utils.NumberUtils;
import com.badlogic.gdx.utils.Pool;
import com.badlogic.gdx.utils.ShortArray;
import com.badlogic.gdx.utils.viewport.ScreenViewport;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2853Wf;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2871Wx;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3089ba0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3197ck0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3375el;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3413f9;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4748uQ;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.B70;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2734Rq;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3274de0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3527gY;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3780jP;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3843k5;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4019m5;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4991x70;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C5033xf0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C5208zf;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C70;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.D70;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC2563La;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.F70;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.G70;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.I70;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3581h5;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4397qQ;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.N70;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.O70;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.RunnableC3976le0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.WD;
import java.io.File;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class SpineRenderAdapter implements ApplicationListener, IControl {
    private final InterfaceC4397qQ MUTEX;
    private final String TAG;
    private final SpineController.Builder builder;
    private boolean isPause;
    private Stage stage;
    private long time;

    public SpineRenderAdapter(SpineController.Builder builder) {
        AbstractC2995aW.q(builder, "builder");
        this.builder = builder;
        this.MUTEX = AbstractC4748uQ.a();
        this.TAG = "SpineRenderAdapter";
    }

    private final boolean containsMeshAttachments(D70 d70) {
        if (d70 == null) {
            return false;
        }
        Array array = d70.c;
        if (array.isEmpty()) {
            return false;
        }
        Array.ArrayIterator it = array.iterator();
        while (it.hasNext()) {
            O70 o70 = (O70) it.next();
            I70 i70 = d70.e;
            if (i70 != null) {
                AbstractC3413f9 abstractC3413f9A = i70.a(d70.h(o70.b).f3494a, o70.b);
                if ((abstractC3413f9A instanceof C3780jP) || (abstractC3413f9A instanceof C5208zf)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: createItem-0E7RQCE, reason: not valid java name */
    private final Object m21createItem0E7RQCE(String str, SpineData spineData, boolean z) {
        D70 d70A;
        if (str != null && spineData != null) {
            try {
                Map<String, G70> rendererList = this.builder.getRendererList();
                G70 g70 = new G70();
                g70.f3106a = true;
                g70.b = true;
                rendererList.put(str, g70);
                this.builder.getCameraList().put(str, new OrthographicCamera());
                String atlasPath = spineData.getAtlasPath();
                if (atlasPath == null || atlasPath.length() == 0) {
                    throw new RuntimeException("atlasPath must not be null");
                }
                String skeletonPath = spineData.getSkeletonPath();
                if (skeletonPath == null || skeletonPath.length() == 0) {
                    throw new RuntimeException("skeletonFileHandle is null");
                }
                this.builder.getAtlasList().put(str, new TextureAtlas(spineData.isAssetsFile() ? Gdx.files.internal(spineData.getAtlasPath()) : new FileHandle(new File(spineData.getAtlasPath()))));
                this.builder.getSkeletonLoaderList().put(str, AbstractC3089ba0.n0(spineData.getSkeletonPath(), "json") ? new B70(this.builder.getAtlasList().get(str), 1) : new B70(this.builder.getAtlasList().get(str), 0));
                F70 f70 = this.builder.getSkeletonLoaderList().get(str);
                if (f70 != null) {
                    d70A = f70.a(spineData.isAssetsFile() ? Gdx.files.internal(spineData.getSkeletonPath()) : new FileHandle(new File(spineData.getSkeletonPath())));
                } else {
                    d70A = null;
                }
                if (!z) {
                    this.builder.getBatchList().put(str, containsMeshAttachments(d70A) ? new PolygonSpriteBatch() : new SpriteBatch());
                }
                this.builder.getSkeletonList().put(str, new C4991x70(d70A));
                this.builder.getAnimStateList().put(str, new C3843k5(new C4019m5(d70A)));
                C4991x70 c4991x70 = this.builder.getSkeletonList().get(str);
                if (c4991x70 != null) {
                    float f = AbstractC2871Wx.g;
                    float positionX = f == 0.0f ? spineData.getPositionX() : f * AbstractC2871Wx.e;
                    float f2 = AbstractC2871Wx.h;
                    float positionY = f2 == 0.0f ? spineData.getPositionY() : AbstractC2871Wx.f * f2;
                    c4991x70.k = positionX;
                    c4991x70.l = positionY;
                }
                OrthographicCamera orthographicCamera = this.builder.getCameraList().get(str);
                if (orthographicCamera != null) {
                    orthographicCamera.zoom = 1.0f;
                }
                if (z) {
                    C3843k5 c3843k5 = this.builder.getAnimStateList().get(str);
                    if (c3843k5 != null) {
                        c3843k5.h = 1.0f;
                    }
                } else {
                    C3843k5 c3843k6 = this.builder.getAnimStateList().get(str);
                    if (c3843k6 != null) {
                        c3843k6.h = 0.0f;
                    }
                }
            } catch (Throwable th) {
                return AbstractC3375el.v(th);
            }
        }
        return C5033xf0.f5238a;
    }

    /* JADX INFO: renamed from: createItem-0E7RQCE$default, reason: not valid java name */
    public static /* synthetic */ Object m22createItem0E7RQCE$default(SpineRenderAdapter spineRenderAdapter, String str, SpineData spineData, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return spineRenderAdapter.m21createItem0E7RQCE(str, spineData, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateSpine$lambda$6$lambda$5(SpineActivity spineActivity, SpineRenderAdapter spineRenderAdapter) throws Throwable {
        AbstractC2995aW.q(spineActivity, "$spineActivity");
        AbstractC2995aW.q(spineRenderAdapter, "this$0");
        WD.R(C2734Rq.f3684a, new SpineRenderAdapter$updateSpine$1$1$1(spineActivity, spineRenderAdapter, null));
    }

    @Override // com.badlogic.gdx.backends.android.IControl
    public void addAnimation(String str, int i, String str2, boolean z, float f, InterfaceC3581h5 interfaceC3581h5) {
        C3843k5 c3843k5;
        AbstractC2995aW.q(str2, "animationName");
        synchronized (this.MUTEX) {
            if (AbstractC2853Wf.d0(this.builder.getAnimStateList().keySet(), str) && (c3843k5 = this.builder.getAnimStateList().get(str)) != null) {
                try {
                    c3843k5.a(i, str2, z, f);
                    c3843k5.h = 1.0f;
                    if (interfaceC3581h5 != null) {
                        c3843k5.b(interfaceC3581h5);
                    }
                } catch (Throwable th) {
                    AbstractC3375el.v(th);
                }
            }
        }
    }

    @Override // com.badlogic.gdx.ApplicationListener
    public void create() {
        Stage stage = new Stage(new ScreenViewport());
        this.stage = stage;
        Stage stage2 = AbstractC3197ck0.f4241a;
        AbstractC3197ck0.f4241a = stage;
        Gdx.input.setInputProcessor(this.stage);
        synchronized (this.MUTEX) {
            try {
                this.time = System.currentTimeMillis();
                Map<String, SpineData> spineDataMap = this.builder.getSpineDataMap();
                if (spineDataMap != null && !spineDataMap.isEmpty()) {
                    for (Map.Entry<String, SpineData> entry : this.builder.getSpineDataMap().entrySet()) {
                        m22createItem0E7RQCE$default(this, entry.getKey(), entry.getValue(), false, 4, null);
                    }
                    SpineController.SpineAnimationCallback callback = this.builder.getCallback();
                    if (callback != null) {
                        SpineController controller = this.builder.getController();
                        AbstractC2995aW.n(controller);
                        callback.onSpineAnimationChanged(controller, this.builder.getSpineView());
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.badlogic.gdx.ApplicationListener
    public void dispose() {
        synchronized (this.MUTEX) {
            this.isPause = true;
            this.builder.release();
        }
    }

    @Override // com.badlogic.gdx.backends.android.IControl
    public N70 findSlot(String str, String str2) {
        Array<N70> array;
        AbstractC2995aW.q(str2, "slotName");
        C4991x70 skeleton = getSkeleton(str);
        if (skeleton == null || (array = skeleton.c) == null) {
            return null;
        }
        for (N70 n70 : array) {
            if (AbstractC2995aW.i(n70.f3442a.b, str2)) {
                return n70;
            }
        }
        return null;
    }

    @Override // com.badlogic.gdx.backends.android.IControl
    public C3843k5 getAnimationState(String str) {
        if (AbstractC2853Wf.d0(this.builder.getAnimStateList().keySet(), str)) {
            return this.builder.getAnimStateList().get(str);
        }
        return null;
    }

    @Override // com.badlogic.gdx.backends.android.IControl
    public C4019m5 getAnimationStateData(String str) {
        C3843k5 c3843k5;
        if (!AbstractC2853Wf.d0(this.builder.getAnimStateList().keySet(), str) || (c3843k5 = this.builder.getAnimStateList().get(str)) == null) {
            return null;
        }
        return c3843k5.f4583a;
    }

    @Override // com.badlogic.gdx.backends.android.IControl
    public TextureAtlas getAtlas(String str) {
        if (AbstractC2853Wf.d0(this.builder.getAnimStateList().keySet(), str)) {
            return this.builder.getAtlasList().get(str);
        }
        return null;
    }

    @Override // com.badlogic.gdx.backends.android.IControl
    public C4991x70 getSkeleton(String str) {
        if (AbstractC2853Wf.d0(this.builder.getAnimStateList().keySet(), str)) {
            return this.builder.getSkeletonList().get(str);
        }
        return null;
    }

    @Override // com.badlogic.gdx.backends.android.IControl
    public F70 getSkeletonLoader(String str) {
        if (AbstractC2853Wf.d0(this.builder.getAnimStateList().keySet(), str)) {
            return this.builder.getSkeletonLoaderList().get(str);
        }
        return null;
    }

    @Override // com.badlogic.gdx.backends.android.IControl
    public void hideAllSlot() {
        Iterator<Map.Entry<String, C4991x70>> it = this.builder.getSkeletonList().entrySet().iterator();
        while (it.hasNext()) {
            Array array = it.next().getValue().c;
            int i = array.size;
            for (int i2 = 0; i2 < i; i2++) {
                ((N70) array.get(i2)).c.f202a = 0.0f;
            }
        }
    }

    @Override // com.badlogic.gdx.backends.android.IControl
    public void hideSlot(String str) {
        Array array;
        C4991x70 skeleton = getSkeleton(str);
        if (skeleton == null || (array = skeleton.c) == null) {
            return;
        }
        Iterator<T> it = array.iterator();
        while (it.hasNext()) {
            ((N70) it.next()).c.f202a = 0.0f;
        }
    }

    @Override // com.badlogic.gdx.ApplicationListener
    public void pause() {
        synchronized (this.MUTEX) {
            this.isPause = true;
            if (true ^ this.builder.getAnimStateList().isEmpty()) {
                Iterator<Map.Entry<String, SpineData>> it = this.builder.getSpineDataMap().entrySet().iterator();
                while (it.hasNext()) {
                    C3843k5 c3843k5 = this.builder.getAnimStateList().get(it.next().getKey());
                    if (c3843k5 != null) {
                        c3843k5.h = 0.0f;
                    }
                }
            }
        }
    }

    public final void pauseSpine(String str) {
        C3843k5 c3843k5;
        AbstractC2995aW.q(str, "spineId");
        synchronized (this.MUTEX) {
            if (!this.builder.getAnimStateList().isEmpty()) {
                Iterator<Map.Entry<String, SpineData>> it = this.builder.getSpineDataMap().entrySet().iterator();
                while (it.hasNext()) {
                    if (AbstractC2995aW.i(it.next().getKey(), str) && (c3843k5 = this.builder.getAnimStateList().get(str)) != null) {
                        c3843k5.h = 0.0f;
                    }
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:173:0x0605 A[PHI: r57 r58 r59 r60 r61 r62 r63
  0x0605: PHI (r57v3 java.lang.Object[]) = 
  (r57v1 java.lang.Object[])
  (r57v1 java.lang.Object[])
  (r57v1 java.lang.Object[])
  (r57v1 java.lang.Object[])
  (r57v4 java.lang.Object[])
 binds: [B:166:0x05c1, B:170:0x05e6, B:171:0x05e8, B:168:0x05c5, B:161:0x0575] A[DONT_GENERATE, DONT_INLINE]
  0x0605: PHI (r58v3 int) = (r58v1 int), (r58v1 int), (r58v1 int), (r58v1 int), (r58v4 int) binds: [B:166:0x05c1, B:170:0x05e6, B:171:0x05e8, B:168:0x05c5, B:161:0x0575] A[DONT_GENERATE, DONT_INLINE]
  0x0605: PHI (r59v6 gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.de0) = 
  (r59v4 gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.de0)
  (r59v4 gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.de0)
  (r59v4 gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.de0)
  (r59v4 gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.de0)
  (r59v7 gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.de0)
 binds: [B:166:0x05c1, B:170:0x05e6, B:171:0x05e8, B:168:0x05c5, B:161:0x0575] A[DONT_GENERATE, DONT_INLINE]
  0x0605: PHI (r60v3 com.badlogic.gdx.utils.Array) = 
  (r60v1 com.badlogic.gdx.utils.Array)
  (r60v1 com.badlogic.gdx.utils.Array)
  (r60v1 com.badlogic.gdx.utils.Array)
  (r60v1 com.badlogic.gdx.utils.Array)
  (r60v4 com.badlogic.gdx.utils.Array)
 binds: [B:166:0x05c1, B:170:0x05e6, B:171:0x05e8, B:168:0x05c5, B:161:0x0575] A[DONT_GENERATE, DONT_INLINE]
  0x0605: PHI (r61v2 int) = (r61v0 int), (r61v0 int), (r61v0 int), (r61v0 int), (r61v3 int) binds: [B:166:0x05c1, B:170:0x05e6, B:171:0x05e8, B:168:0x05c5, B:161:0x0575] A[DONT_GENERATE, DONT_INLINE]
  0x0605: PHI (r62v3 int) = (r62v0 int), (r62v0 int), (r62v0 int), (r62v0 int), (r62v4 int) binds: [B:166:0x05c1, B:170:0x05e6, B:171:0x05e8, B:168:0x05c5, B:161:0x0575] A[DONT_GENERATE, DONT_INLINE]
  0x0605: PHI (r63v5 java.lang.Object[]) = 
  (r63v2 java.lang.Object[])
  (r63v2 java.lang.Object[])
  (r63v2 java.lang.Object[])
  (r63v2 java.lang.Object[])
  (r4v24 java.lang.Object[])
 binds: [B:166:0x05c1, B:170:0x05e6, B:171:0x05e8, B:168:0x05c5, B:161:0x0575] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:338:0x0c80  */
    /* JADX WARN: Code duplicated, block: B:37:0x00d4 A[Catch: all -> 0x006d, TryCatch #2 {all -> 0x006d, blocks: (B:4:0x0005, B:8:0x000b, B:12:0x0019, B:13:0x0034, B:15:0x003a, B:17:0x0054, B:24:0x0076, B:26:0x0085, B:27:0x0088, B:29:0x0096, B:30:0x0099, B:32:0x00a5, B:34:0x00b7, B:36:0x00ce, B:38:0x00d9, B:37:0x00d4, B:39:0x00dc, B:41:0x00ea, B:43:0x00f0, B:45:0x00fe, B:47:0x0102, B:48:0x0105, B:50:0x0113, B:51:0x0116, B:339:0x0c87, B:341:0x0c97, B:23:0x0073), top: B:350:0x0005, inners: #3 }] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.badlogic.gdx.ApplicationListener
    public void render() throws Throwable {
        Throwable th;
        G70 g70;
        int i;
        C70 c70;
        float f;
        float f2;
        int i2;
        Color color;
        float[] fArr;
        float[] fArr2;
        short[] sArr;
        Texture texture;
        int i3;
        Array array;
        C3274de0 c3274de0;
        Object[] objArr;
        C3274de0 c3274de1;
        Object[] objArr2;
        int i4;
        Array array2;
        Object[] objArr3;
        int i5;
        C3274de0 c3274de2;
        Array array3;
        int i6;
        int i7;
        float[] fArr3;
        boolean z;
        O70 o70;
        float[] fArr4;
        float[] fArr5;
        PolygonSpriteBatch polygonSpriteBatch;
        PolygonSpriteBatch polygonSpriteBatch2;
        float f3;
        C70 c71;
        C70 c72;
        float f4;
        float[] fArr6;
        int i8;
        ShortArray shortArray;
        Object[] objArr4;
        FloatArray floatArray;
        FloatArray floatArray2;
        FloatArray floatArray3;
        int i9;
        FloatArray floatArray4;
        ShortArray shortArray2;
        EnumC2563La enumC2563La;
        Matrix4 projectionMatrix;
        Batch spriteBatch;
        SpineRenderAdapter spineRenderAdapter = this;
        synchronized (spineRenderAdapter.MUTEX) {
            try {
                if (spineRenderAdapter.isPause) {
                    return;
                }
                if (spineRenderAdapter.builder.getBatchList().isEmpty()) {
                    return;
                }
                Gdx.gl.glClear(16384);
                Gdx.gl.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
                for (Iterator<Map.Entry<String, SpineData>> it = spineRenderAdapter.builder.getSpineDataMap().entrySet().iterator(); it.hasNext(); it = it) {
                    String key = it.next().getKey();
                    C3843k5 c3843k5 = spineRenderAdapter.builder.getAnimStateList().get(key);
                    if (c3843k5 != null) {
                        try {
                            c3843k5.s(Gdx.graphics.getDeltaTime());
                            c3843k5.c(spineRenderAdapter.builder.getSkeletonList().get(key));
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                    C4991x70 c4991x70 = spineRenderAdapter.builder.getSkeletonList().get(key);
                    if (c4991x70 != null) {
                        c4991x70.h(3);
                    }
                    OrthographicCamera orthographicCamera = spineRenderAdapter.builder.getCameraList().get(key);
                    if (orthographicCamera != null) {
                        orthographicCamera.update();
                    }
                    if (spineRenderAdapter.builder.getBatchList().get(key) == null) {
                        Map<String, Batch> batchList = spineRenderAdapter.builder.getBatchList();
                        if (spineRenderAdapter.builder.getSkeletonList().get(key) != null) {
                            C4991x70 c4991x71 = spineRenderAdapter.builder.getSkeletonList().get(key);
                            AbstractC2995aW.n(c4991x71);
                            if (spineRenderAdapter.containsMeshAttachments(c4991x71.f5208a)) {
                                spriteBatch = new PolygonSpriteBatch();
                            } else {
                                spriteBatch = new SpriteBatch();
                            }
                        } else {
                            spriteBatch = new SpriteBatch();
                        }
                        batchList.put(key, spriteBatch);
                    }
                    Batch batch = spineRenderAdapter.builder.getBatchList().get(key);
                    if (batch != null && (projectionMatrix = batch.getProjectionMatrix()) != null) {
                        OrthographicCamera orthographicCamera2 = spineRenderAdapter.builder.getCameraList().get(key);
                        projectionMatrix.set(orthographicCamera2 != null ? orthographicCamera2.combined : null);
                    }
                    Batch batch2 = spineRenderAdapter.builder.getBatchList().get(key);
                    if (batch2 != null) {
                        batch2.begin();
                    }
                    if (spineRenderAdapter.builder.getSkeletonList().get(key) != null) {
                        try {
                            if (spineRenderAdapter.builder.getBatchList().get(key) != null && (g70 = spineRenderAdapter.builder.getRendererList().get(key)) != null) {
                                Batch batch3 = spineRenderAdapter.builder.getBatchList().get(key);
                                C4991x70 c4991x72 = spineRenderAdapter.builder.getSkeletonList().get(key);
                                try {
                                    boolean z2 = batch3 instanceof PolygonSpriteBatch;
                                    FloatArray floatArray5 = g70.c;
                                    if (z2) {
                                        PolygonSpriteBatch polygonSpriteBatch3 = (PolygonSpriteBatch) batch3;
                                        if (polygonSpriteBatch3 == null) {
                                            throw new IllegalArgumentException("batch cannot be null.");
                                        }
                                        if (c4991x72 == null) {
                                            throw new IllegalArgumentException("skeleton cannot be null.");
                                        }
                                        boolean z3 = g70.f3106a;
                                        boolean z4 = g70.b;
                                        Color color2 = c4991x72.j;
                                        float f5 = color2.r;
                                        float f6 = color2.g;
                                        float f7 = color2.b;
                                        float f8 = color2.f202a;
                                        Array array4 = c4991x72.d;
                                        Object[] objArr5 = array4.items;
                                        int i10 = array4.size;
                                        int i11 = 0;
                                        EnumC2563La enumC2563La2 = null;
                                        int i12 = 0;
                                        Color color3 = null;
                                        float[] fArr7 = null;
                                        float[] fArr8 = null;
                                        short[] sArr2 = null;
                                        while (true) {
                                            c70 = g70.d;
                                            if (i11 >= i10) {
                                                break;
                                            }
                                            Object[] objArr6 = objArr5;
                                            N70 n70 = (N70) objArr5[i11];
                                            int i13 = i10;
                                            boolean z5 = n70.b.A;
                                            G70 g71 = g70;
                                            O70 o71 = n70.f3442a;
                                            if (z5) {
                                                C5208zf c5208zf = c70.h;
                                                int i14 = c5208zf != null ? 2 : 5;
                                                AbstractC3413f9 abstractC3413f9 = n70.e;
                                                f = f6;
                                                f2 = f7;
                                                if (abstractC3413f9 instanceof C3527gY) {
                                                    C3527gY c3527gY = (C3527gY) abstractC3413f9;
                                                    int i15 = i14 << 2;
                                                    fArr = floatArray5.items;
                                                    c3527gY.i(n70, fArr, i14);
                                                    short[] sArr3 = G70.e;
                                                    Texture texture2 = c3527gY.c.getTexture();
                                                    float[] fArr9 = c3527gY.k;
                                                    color = c3527gY.m;
                                                    texture = texture2;
                                                    fArr2 = fArr9;
                                                    i2 = i15;
                                                    sArr = sArr3;
                                                } else if (abstractC3413f9 instanceof C3780jP) {
                                                    C3780jP c3780jP = (C3780jP) abstractC3413f9;
                                                    int i16 = c3780jP.g;
                                                    i2 = (i16 >> 1) * i14;
                                                    float[] size = floatArray5.setSize(i2);
                                                    c3780jP.i(n70, 0, i16, size, 0, i14);
                                                    sArr = c3780jP.l;
                                                    Texture texture3 = c3780jP.i.getTexture();
                                                    fArr2 = c3780jP.k;
                                                    color = c3780jP.m;
                                                    texture = texture3;
                                                    fArr = size;
                                                } else if (abstractC3413f9 instanceof C5208zf) {
                                                    C5208zf c5208zf2 = (C5208zf) abstractC3413f9;
                                                    if (c5208zf == null && (i3 = c5208zf2.g) >= 6) {
                                                        c70.h = c5208zf2;
                                                        FloatArray floatArray6 = c70.b;
                                                        c5208zf2.i(n70, 0, i3, floatArray6.setSize(i3), 0, 2);
                                                        C70.b(floatArray6);
                                                        C3274de0 c3274de3 = c70.f2911a;
                                                        c3274de3.getClass();
                                                        float[] fArr10 = floatArray6.items;
                                                        int i17 = floatArray6.size >> 1;
                                                        ShortArray shortArray3 = (ShortArray) c3274de3.c;
                                                        shortArray3.clear();
                                                        short[] size2 = shortArray3.setSize(i17);
                                                        for (short s = 0; s < i17; s = (short) (s + 1)) {
                                                            size2[s] = s;
                                                        }
                                                        BooleanArray booleanArray = (BooleanArray) c3274de3.e;
                                                        boolean[] size3 = booleanArray.setSize(i17);
                                                        for (int i18 = 0; i18 < i17; i18++) {
                                                            size3[i18] = C3274de0.g(fArr10, i18, i17, size2);
                                                        }
                                                        ShortArray shortArray4 = (ShortArray) c3274de3.d;
                                                        shortArray4.clear();
                                                        shortArray4.ensureCapacity(Math.max(0, i17 - 2) << 2);
                                                        int i19 = i17;
                                                        while (i19 > 3) {
                                                            int i20 = i19 - 1;
                                                            int i21 = 0;
                                                            int i22 = 1;
                                                            while (true) {
                                                                if (size3[i21]) {
                                                                    z = z4;
                                                                } else {
                                                                    int i23 = size2[i20] << 1;
                                                                    int i24 = size2[i21] << 1;
                                                                    int i25 = size2[i22] << 1;
                                                                    float f9 = fArr10[i23];
                                                                    float f10 = fArr10[i23 + 1];
                                                                    float f11 = fArr10[i24];
                                                                    float f12 = fArr10[i24 + 1];
                                                                    float f13 = fArr10[i25];
                                                                    float f14 = fArr10[i25 + 1];
                                                                    z = z4;
                                                                    int i26 = (i22 + 1) % i19;
                                                                    while (true) {
                                                                        if (i26 == i20) {
                                                                            break;
                                                                        }
                                                                        if (size3[i26]) {
                                                                            int i27 = size2[i26] << 1;
                                                                            float f15 = fArr10[i27];
                                                                            float f16 = fArr10[i27 + 1];
                                                                            if (C3274de0.i(f13, f14, f9, f10, f15, f16) && C3274de0.i(f9, f10, f11, f12, f15, f16) && C3274de0.i(f11, f12, f13, f14, f15, f16)) {
                                                                                break;
                                                                            }
                                                                        }
                                                                        i26 = (i26 + 1) % i19;
                                                                    }
                                                                }
                                                                if (i22 == 0) {
                                                                    while (size3[i21] && (i21 = i21 - 1) > 0) {
                                                                    }
                                                                } else {
                                                                    z4 = z;
                                                                    int i28 = i22;
                                                                    i22 = (i22 + 1) % i19;
                                                                    i20 = i21;
                                                                    i21 = i28;
                                                                }
                                                            }
                                                            int i29 = i21;
                                                            shortArray4.add(size2[((i19 + i29) - 1) % i19]);
                                                            shortArray4.add(size2[i29]);
                                                            shortArray4.add(size2[(i29 + 1) % i19]);
                                                            shortArray3.removeIndex(i29);
                                                            booleanArray.removeIndex(i29);
                                                            i19--;
                                                            int i30 = ((i19 + i29) - 1) % i19;
                                                            if (i29 == i19) {
                                                                i29 = 0;
                                                            }
                                                            size3[i30] = C3274de0.g(fArr10, i30, i19, size2);
                                                            size3[i29] = C3274de0.g(fArr10, i29, i19, size2);
                                                            z4 = z;
                                                        }
                                                        z4 = z4;
                                                        if (i19 == 3) {
                                                            shortArray4.add(size2[2]);
                                                            shortArray4.add(size2[0]);
                                                            shortArray4.add(size2[1]);
                                                        }
                                                        float[] fArr11 = floatArray6.items;
                                                        Array array5 = (Array) c3274de3.f4281a;
                                                        ((Pool) c3274de3.f).freeAll(array5);
                                                        array5.clear();
                                                        Array array6 = (Array) c3274de3.b;
                                                        ((Pool) c3274de3.g).freeAll(array6);
                                                        array6.clear();
                                                        ShortArray shortArray5 = (ShortArray) ((Pool) c3274de3.g).obtain();
                                                        shortArray5.clear();
                                                        FloatArray floatArray7 = (FloatArray) ((Pool) c3274de3.f).obtain();
                                                        floatArray7.clear();
                                                        short[] sArr4 = shortArray4.items;
                                                        int i31 = shortArray4.size;
                                                        int i32 = -1;
                                                        int iL = 0;
                                                        int i33 = 0;
                                                        while (i33 < i31) {
                                                            int i34 = i31;
                                                            int i35 = sArr4[i33] << 1;
                                                            boolean z6 = z3;
                                                            int i36 = sArr4[i33 + 1] << 1;
                                                            short[] sArr5 = sArr4;
                                                            int i37 = sArr4[i33 + 2] << 1;
                                                            float f17 = f8;
                                                            float f18 = fArr11[i35];
                                                            C70 c73 = c70;
                                                            float f19 = fArr11[i35 + 1];
                                                            int i38 = i33;
                                                            float f20 = fArr11[i36];
                                                            float f21 = fArr11[i36 + 1];
                                                            float f22 = fArr11[i37];
                                                            float f23 = fArr11[i37 + 1];
                                                            if (i32 == i35) {
                                                                fArr3 = fArr11;
                                                                int i39 = floatArray7.size;
                                                                int i40 = i32;
                                                                float[] fArr12 = floatArray7.items;
                                                                int iL2 = C3274de0.l(fArr12[i39 - 4], fArr12[i39 - 3], fArr12[i39 - 2], fArr12[i39 - 1], f22, f23);
                                                                int iL3 = C3274de0.l(f22, f23, fArr12[0], fArr12[1], fArr12[2], fArr12[3]);
                                                                if (iL2 == iL && iL3 == iL) {
                                                                    floatArray7.add(f22);
                                                                    floatArray7.add(f23);
                                                                    shortArray5.add(i37);
                                                                    i32 = i40;
                                                                }
                                                                i33 = i38 + 3;
                                                                i31 = i34;
                                                                z3 = z6;
                                                                sArr4 = sArr5;
                                                                f8 = f17;
                                                                c70 = c73;
                                                                fArr11 = fArr3;
                                                            } else {
                                                                fArr3 = fArr11;
                                                            }
                                                            if (floatArray7.size > 0) {
                                                                array5.add(floatArray7);
                                                                array6.add(shortArray5);
                                                                floatArray7 = (FloatArray) ((Pool) c3274de3.f).obtain();
                                                                shortArray5 = (ShortArray) ((Pool) c3274de3.g).obtain();
                                                            }
                                                            floatArray7.clear();
                                                            floatArray7.add(f18);
                                                            floatArray7.add(f19);
                                                            floatArray7.add(f20);
                                                            floatArray7.add(f21);
                                                            floatArray7.add(f22);
                                                            floatArray7.add(f23);
                                                            shortArray5.clear();
                                                            shortArray5.add(i35);
                                                            shortArray5.add(i36);
                                                            shortArray5.add(i37);
                                                            iL = C3274de0.l(f18, f19, f20, f21, f22, f23);
                                                            i32 = i35;
                                                            i33 = i38 + 3;
                                                            i31 = i34;
                                                            z3 = z6;
                                                            sArr4 = sArr5;
                                                            f8 = f17;
                                                            c70 = c73;
                                                            fArr11 = fArr3;
                                                        }
                                                        C70 c74 = c70;
                                                        z3 = z3;
                                                        f8 = f8;
                                                        if (floatArray7.size > 0) {
                                                            array5.add(floatArray7);
                                                            array6.add(shortArray5);
                                                        }
                                                        Object[] objArr7 = array6.items;
                                                        Object[] objArr8 = array5.items;
                                                        int i41 = array5.size;
                                                        int i42 = 0;
                                                        while (i42 < i41) {
                                                            ShortArray shortArray6 = (ShortArray) objArr7[i42];
                                                            if (shortArray6.size == 0) {
                                                                objArr = objArr7;
                                                                c3274de1 = c3274de3;
                                                                objArr2 = objArr8;
                                                                i4 = i41;
                                                                array2 = array5;
                                                            } else {
                                                                short sFirst = shortArray6.first();
                                                                short s2 = shortArray6.get(shortArray6.size - 1);
                                                                FloatArray floatArray8 = (FloatArray) objArr8[i42];
                                                                int i43 = floatArray8.size;
                                                                float[] fArr13 = floatArray8.items;
                                                                float f24 = fArr13[i43 - 4];
                                                                float f25 = fArr13[i43 - 3];
                                                                float f26 = fArr13[i43 - 2];
                                                                float f27 = fArr13[i43 - 1];
                                                                float f28 = fArr13[0];
                                                                float f29 = fArr13[1];
                                                                float f30 = fArr13[2];
                                                                float f31 = fArr13[3];
                                                                float f32 = f27;
                                                                int iL4 = C3274de0.l(f24, f25, f26, f27, f28, f29);
                                                                float f33 = f26;
                                                                int i44 = 0;
                                                                while (i44 < i41) {
                                                                    if (i44 == i42) {
                                                                        objArr3 = objArr7;
                                                                        c3274de2 = c3274de3;
                                                                        i5 = i41;
                                                                    } else {
                                                                        objArr3 = objArr7;
                                                                        ShortArray shortArray7 = (ShortArray) objArr7[i44];
                                                                        i5 = i41;
                                                                        c3274de2 = c3274de3;
                                                                        if (shortArray7.size == 3) {
                                                                            short sFirst2 = shortArray7.first();
                                                                            array3 = array5;
                                                                            short s3 = shortArray7.get(1);
                                                                            i6 = i42;
                                                                            short s4 = shortArray7.get(2);
                                                                            FloatArray floatArray9 = (FloatArray) objArr8[i44];
                                                                            i7 = i44;
                                                                            float f34 = floatArray9.get(floatArray9.size - 2);
                                                                            objArr8 = objArr8;
                                                                            float f35 = floatArray9.get(floatArray9.size - 1);
                                                                            if (sFirst2 == sFirst && s3 == s2) {
                                                                                int iL5 = C3274de0.l(f24, f25, f33, f32, f34, f35);
                                                                                int iL6 = C3274de0.l(f34, f35, f28, f29, f30, f31);
                                                                                if (iL5 == iL4 && iL6 == iL4) {
                                                                                    floatArray9.clear();
                                                                                    shortArray7.clear();
                                                                                    floatArray8.add(f34);
                                                                                    floatArray8.add(f35);
                                                                                    shortArray6.add((int) s4);
                                                                                    f25 = f32;
                                                                                    f24 = f33;
                                                                                    i7 = 0;
                                                                                    f32 = f35;
                                                                                    f33 = f34;
                                                                                }
                                                                            }
                                                                        }
                                                                        i44 = i7 + 1;
                                                                        objArr7 = objArr3;
                                                                        i41 = i5;
                                                                        c3274de3 = c3274de2;
                                                                        array5 = array3;
                                                                        i42 = i6;
                                                                        objArr8 = objArr8;
                                                                    }
                                                                    array3 = array5;
                                                                    i7 = i44;
                                                                    i6 = i42;
                                                                    i44 = i7 + 1;
                                                                    objArr7 = objArr3;
                                                                    i41 = i5;
                                                                    c3274de3 = c3274de2;
                                                                    array5 = array3;
                                                                    i42 = i6;
                                                                    objArr8 = objArr8;
                                                                }
                                                                objArr = objArr7;
                                                                c3274de1 = c3274de3;
                                                                objArr2 = objArr8;
                                                                i4 = i41;
                                                                array2 = array5;
                                                            }
                                                            i42++;
                                                            array6 = array6;
                                                            objArr7 = objArr;
                                                            i41 = i4;
                                                            c3274de3 = c3274de1;
                                                            array5 = array2;
                                                            objArr8 = objArr2;
                                                        }
                                                        C3274de0 c3274de4 = c3274de3;
                                                        Object[] objArr9 = objArr8;
                                                        Array array7 = array6;
                                                        int i45 = array5.size - 1;
                                                        while (i45 >= 0) {
                                                            FloatArray floatArray10 = (FloatArray) objArr9[i45];
                                                            if (floatArray10.size == 0) {
                                                                array5.removeIndex(i45);
                                                                c3274de0 = c3274de4;
                                                                ((Pool) c3274de0.f).free(floatArray10);
                                                                array = array7;
                                                                ((Pool) c3274de0.g).free((ShortArray) array.removeIndex(i45));
                                                            } else {
                                                                array = array7;
                                                                c3274de0 = c3274de4;
                                                            }
                                                            i45--;
                                                            c3274de4 = c3274de0;
                                                            array7 = array;
                                                        }
                                                        c74.i = array5;
                                                        Array.ArrayIterator it2 = array5.iterator();
                                                        while (it2.hasNext()) {
                                                            FloatArray floatArray11 = (FloatArray) it2.next();
                                                            C70.b(floatArray11);
                                                            floatArray11.add(floatArray11.items[0]);
                                                            floatArray11.add(floatArray11.items[1]);
                                                        }
                                                    } else {
                                                        z3 = z3;
                                                        z4 = z4;
                                                        f8 = f8;
                                                    }
                                                } else {
                                                    i2 = i12;
                                                    color = color3;
                                                    fArr = fArr7;
                                                    fArr2 = fArr8;
                                                    sArr = sArr2;
                                                    texture = null;
                                                }
                                                if (texture != null) {
                                                    Color color4 = n70.c;
                                                    float f36 = f8 * color4.f202a * color.f202a * 255.0f;
                                                    float f37 = z3 != 0 ? f36 : 255.0f;
                                                    EnumC2563La enumC2563La3 = o71.g;
                                                    EnumC2563La enumC2563La4 = enumC2563La2;
                                                    if (enumC2563La3 != enumC2563La4) {
                                                        if (enumC2563La3 == EnumC2563La.additive && z3) {
                                                            enumC2563La = EnumC2563La.normal;
                                                            f3 = 0.0f;
                                                        } else {
                                                            f3 = f36;
                                                            enumC2563La = enumC2563La3;
                                                        }
                                                        int i46 = z4 ? enumC2563La.b : enumC2563La.f3358a;
                                                        int i47 = enumC2563La.c;
                                                        int i48 = enumC2563La.d;
                                                        EnumC2563La enumC2563La5 = enumC2563La;
                                                        polygonSpriteBatch2 = polygonSpriteBatch3;
                                                        polygonSpriteBatch2.setBlendFunctionSeparate(i46, i47, i48, i47);
                                                        enumC2563La4 = enumC2563La5;
                                                    } else {
                                                        polygonSpriteBatch2 = polygonSpriteBatch3;
                                                        f3 = f36;
                                                    }
                                                    float fIntToFloatColor = NumberUtils.intToFloatColor(((int) (color4.r * f5 * color.r * f37)) | (((int) f3) << 24) | (((int) (((color4.b * f2) * color.b) * f37)) << 16) | (((int) (((color4.g * f) * color.g) * f37)) << 8));
                                                    if (c70.h != null) {
                                                        int length = sArr.length;
                                                        Array array8 = c70.i;
                                                        Object[] objArr10 = array8.items;
                                                        int i49 = array8.size;
                                                        FloatArray floatArray12 = c70.d;
                                                        floatArray12.clear();
                                                        c70.e.clear();
                                                        ShortArray shortArray8 = c70.f;
                                                        shortArray8.clear();
                                                        int i50 = 0;
                                                        short s5 = 0;
                                                        while (i50 < length) {
                                                            int i51 = sArr[i50] << 1;
                                                            int i52 = length;
                                                            float f38 = fArr[i51];
                                                            int i53 = i51 + 1;
                                                            O70 o72 = o71;
                                                            float f39 = fArr[i53];
                                                            float f40 = fArr2[i51];
                                                            float f41 = fArr2[i53];
                                                            int i54 = sArr[i50 + 1] << 1;
                                                            int i55 = i2;
                                                            float f42 = fArr[i54];
                                                            int i56 = i54 + 1;
                                                            PolygonSpriteBatch polygonSpriteBatch4 = polygonSpriteBatch2;
                                                            float f43 = fArr[i56];
                                                            float f44 = fArr2[i54];
                                                            float f45 = fArr2[i56];
                                                            int i57 = sArr[i50 + 2] << 1;
                                                            short[] sArr6 = sArr;
                                                            float f46 = fArr[i57];
                                                            int i58 = i57 + 1;
                                                            int i59 = i50;
                                                            float f47 = fArr[i58];
                                                            float f48 = fArr2[i57];
                                                            float f49 = fArr2[i58];
                                                            float[] fArr14 = fArr2;
                                                            int i60 = 0;
                                                            while (true) {
                                                                if (i60 >= i49) {
                                                                    c72 = c70;
                                                                    f4 = fIntToFloatColor;
                                                                    fArr6 = fArr;
                                                                    i8 = i49;
                                                                    shortArray = shortArray8;
                                                                    objArr4 = objArr10;
                                                                    floatArray = floatArray12;
                                                                    break;
                                                                }
                                                                i8 = i49;
                                                                int i61 = floatArray12.size;
                                                                objArr4 = objArr10;
                                                                FloatArray floatArray13 = (FloatArray) objArr10[i60];
                                                                fArr6 = fArr;
                                                                int i62 = floatArray13.size % 4;
                                                                int i63 = i60;
                                                                FloatArray floatArray14 = c70.c;
                                                                ShortArray shortArray9 = shortArray8;
                                                                FloatArray floatArray15 = c70.g;
                                                                if (i62 >= 2) {
                                                                    floatArray2 = floatArray14;
                                                                } else {
                                                                    floatArray2 = floatArray15;
                                                                    floatArray15 = floatArray14;
                                                                }
                                                                floatArray2.clear();
                                                                floatArray2.add(f38);
                                                                floatArray2.add(f39);
                                                                floatArray2.add(f42);
                                                                floatArray2.add(f43);
                                                                floatArray2.add(f46);
                                                                floatArray2.add(f47);
                                                                floatArray2.add(f38);
                                                                floatArray2.add(f39);
                                                                floatArray15.clear();
                                                                int i64 = floatArray13.size - 4;
                                                                float[] fArr15 = floatArray13.items;
                                                                f4 = fIntToFloatColor;
                                                                int i65 = 0;
                                                                boolean z7 = false;
                                                                FloatArray floatArray16 = floatArray15;
                                                                c72 = c70;
                                                                FloatArray floatArray17 = floatArray2;
                                                                FloatArray floatArray18 = floatArray16;
                                                                while (true) {
                                                                    float f50 = fArr15[i65];
                                                                    float f51 = fArr15[i65 + 1];
                                                                    int i66 = i65 + 2;
                                                                    float f52 = f50 - fArr15[i66];
                                                                    float f53 = f51 - fArr15[i65 + 3];
                                                                    float[] fArr16 = fArr15;
                                                                    int i67 = floatArray18.size;
                                                                    floatArray3 = floatArray12;
                                                                    float[] fArr17 = floatArray17.items;
                                                                    i9 = i61;
                                                                    int i68 = floatArray17.size - 2;
                                                                    FloatArray floatArray19 = floatArray17;
                                                                    int i69 = 0;
                                                                    while (i69 < i68) {
                                                                        float f54 = fArr17[i69];
                                                                        float f55 = fArr17[i69 + 1];
                                                                        i69 += 2;
                                                                        i68 = i68;
                                                                        float f56 = fArr17[i69];
                                                                        float f57 = fArr17[i69 + 3];
                                                                        boolean z8 = (f50 - f56) * f53 > (f51 - f57) * f52;
                                                                        float f58 = ((f50 - f54) * f53) - ((f51 - f55) * f52);
                                                                        if (f58 <= 0.0f) {
                                                                            if (z8) {
                                                                                float f59 = f56 - f54;
                                                                                float f60 = f57 - f55;
                                                                                float f61 = f58 / ((f59 * f53) - (f60 * f52));
                                                                                if (f61 < 0.0f || f61 > 1.0f) {
                                                                                    floatArray18.add(f56);
                                                                                    floatArray18.add(f57);
                                                                                } else {
                                                                                    floatArray18.add((f59 * f61) + f54);
                                                                                    floatArray18.add((f60 * f61) + f55);
                                                                                    floatArray18.add(f56);
                                                                                    floatArray18.add(f57);
                                                                                }
                                                                            }
                                                                            z7 = true;
                                                                        } else if (z8) {
                                                                            floatArray18.add(f56);
                                                                            floatArray18.add(f57);
                                                                        } else {
                                                                            float f62 = f56 - f54;
                                                                            float f63 = f57 - f55;
                                                                            float f64 = f58 / ((f62 * f53) - (f63 * f52));
                                                                            if (f64 < 0.0f || f64 > 1.0f) {
                                                                                floatArray18.add(f56);
                                                                                floatArray18.add(f57);
                                                                            } else {
                                                                                floatArray18.add((f62 * f64) + f54);
                                                                                floatArray18.add((f63 * f64) + f55);
                                                                                z7 = true;
                                                                            }
                                                                        }
                                                                    }
                                                                    if (i67 == floatArray18.size) {
                                                                        floatArray14.clear();
                                                                        break;
                                                                    }
                                                                    floatArray18.add(floatArray18.items[0]);
                                                                    floatArray18.add(floatArray18.items[1]);
                                                                    if (i65 == i64) {
                                                                        if (floatArray14 != floatArray18) {
                                                                            floatArray14.clear();
                                                                            floatArray14.addAll(floatArray18.items, 0, floatArray18.size - 2);
                                                                        } else {
                                                                            floatArray14.setSize(floatArray14.size - 2);
                                                                        }
                                                                        if (!z7) {
                                                                            shortArray = shortArray9;
                                                                            floatArray = floatArray3;
                                                                            float[] size4 = floatArray.setSize(15 + i9);
                                                                            size4[i9] = f38;
                                                                            size4[i9 + 1] = f39;
                                                                            size4[i9 + 2] = f4;
                                                                            size4[i9 + 3] = f40;
                                                                            size4[i9 + 4] = f41;
                                                                            size4[i9 + 5] = f42;
                                                                            size4[i9 + 6] = f43;
                                                                            size4[i9 + 7] = f4;
                                                                            size4[i9 + 8] = f44;
                                                                            size4[i9 + 9] = f45;
                                                                            size4[i9 + 10] = f46;
                                                                            size4[i9 + 11] = f47;
                                                                            size4[i9 + 12] = f4;
                                                                            size4[i9 + 13] = f48;
                                                                            size4[i9 + 14] = f49;
                                                                            int i70 = shortArray.size;
                                                                            short[] size5 = shortArray.setSize(i70 + 3);
                                                                            size5[i70] = s5;
                                                                            size5[i70 + 1] = (short) (s5 + 1);
                                                                            size5[i70 + 2] = (short) (s5 + 2);
                                                                            s5 = (short) (s5 + 3);
                                                                            break;
                                                                        }
                                                                        break;
                                                                    }
                                                                    floatArray19.clear();
                                                                    shortArray9 = shortArray9;
                                                                    floatArray12 = floatArray3;
                                                                    floatArray17 = floatArray18;
                                                                    i65 = i66;
                                                                    f43 = f43;
                                                                    fArr15 = fArr16;
                                                                    i61 = i9;
                                                                    floatArray18 = floatArray19;
                                                                }
                                                                int i71 = floatArray14.size;
                                                                if (i71 == 0) {
                                                                    shortArray2 = shortArray9;
                                                                    floatArray4 = floatArray3;
                                                                } else {
                                                                    float f65 = f43 - f47;
                                                                    float f66 = f46 - f42;
                                                                    float f67 = f38 - f46;
                                                                    float f68 = f47 - f39;
                                                                    float f69 = 1.0f / (((f39 - f47) * f66) + (f65 * f67));
                                                                    int i72 = i71 >> 1;
                                                                    float[] fArr18 = floatArray14.items;
                                                                    floatArray4 = floatArray3;
                                                                    float[] size6 = floatArray4.setSize((i72 * 5) + i9);
                                                                    int i73 = 0;
                                                                    while (i73 < i71) {
                                                                        float f70 = fArr18[i73];
                                                                        float f71 = fArr18[i73 + 1];
                                                                        size6[i9] = f70;
                                                                        size6[i9 + 1] = f71;
                                                                        size6[i9 + 2] = f4;
                                                                        float f72 = f70 - f46;
                                                                        float f73 = f71 - f47;
                                                                        float f74 = ((f66 * f73) + (f65 * f72)) * f69;
                                                                        float f75 = ((f73 * f67) + (f72 * f68)) * f69;
                                                                        float f76 = (1.0f - f74) - f75;
                                                                        size6[i9 + 3] = (f48 * f76) + (f44 * f75) + (f40 * f74);
                                                                        size6[i9 + 4] = (f76 * f49) + (f75 * f45) + (f74 * f41);
                                                                        i73 += 2;
                                                                        i9 += 5;
                                                                    }
                                                                    shortArray2 = shortArray9;
                                                                    int i74 = shortArray2.size;
                                                                    short[] size7 = shortArray2.setSize(((i72 - 2) * 3) + i74);
                                                                    int i75 = i72 - 1;
                                                                    int i76 = 1;
                                                                    while (i76 < i75) {
                                                                        size7[i74] = s5;
                                                                        int i77 = s5 + i76;
                                                                        size7[i74 + 1] = (short) i77;
                                                                        size7[i74 + 2] = (short) (i77 + 1);
                                                                        i76++;
                                                                        i74 += 3;
                                                                    }
                                                                    s5 = (short) (s5 + i72);
                                                                }
                                                                i60 = i63 + 1;
                                                                shortArray8 = shortArray2;
                                                                floatArray12 = floatArray4;
                                                                i49 = i8;
                                                                fArr = fArr6;
                                                                objArr10 = objArr4;
                                                                c70 = c72;
                                                                fIntToFloatColor = f4;
                                                                f43 = f43;
                                                            }
                                                            i50 = i59 + 3;
                                                            shortArray8 = shortArray;
                                                            floatArray12 = floatArray;
                                                            length = i52;
                                                            o71 = o72;
                                                            i2 = i55;
                                                            polygonSpriteBatch2 = polygonSpriteBatch4;
                                                            sArr = sArr6;
                                                            fArr2 = fArr14;
                                                            i49 = i8;
                                                            fArr = fArr6;
                                                            objArr10 = objArr4;
                                                            c70 = c72;
                                                            fIntToFloatColor = f4;
                                                        }
                                                        c71 = c70;
                                                        polygonSpriteBatch = polygonSpriteBatch2;
                                                        o70 = o71;
                                                        fArr4 = fArr;
                                                        fArr5 = fArr2;
                                                        ShortArray shortArray10 = shortArray8;
                                                        FloatArray floatArray20 = floatArray12;
                                                        polygonSpriteBatch.draw(texture, floatArray20.items, 0, floatArray20.size, shortArray10.items, 0, shortArray10.size);
                                                        i2 = i2;
                                                        sArr = sArr;
                                                    } else {
                                                        c71 = c70;
                                                        short[] sArr7 = sArr;
                                                        polygonSpriteBatch = polygonSpriteBatch2;
                                                        o70 = o71;
                                                        fArr4 = fArr;
                                                        fArr5 = fArr2;
                                                        int i78 = 0;
                                                        int i79 = 2;
                                                        while (i79 < i2) {
                                                            fArr4[i79] = fIntToFloatColor;
                                                            fArr4[i79 + 1] = fArr5[i78];
                                                            fArr4[i79 + 2] = fArr5[i78 + 1];
                                                            i79 += 5;
                                                            i78 += 2;
                                                        }
                                                        sArr = sArr7;
                                                        polygonSpriteBatch.draw(texture, fArr4, 0, i2, sArr, 0, sArr.length);
                                                    }
                                                    enumC2563La2 = enumC2563La4;
                                                    c70 = c71;
                                                } else {
                                                    o70 = o71;
                                                    fArr4 = fArr;
                                                    fArr5 = fArr2;
                                                    color = color;
                                                    polygonSpriteBatch = polygonSpriteBatch3;
                                                    enumC2563La2 = enumC2563La2;
                                                }
                                                C5208zf c5208zf3 = c70.h;
                                                if (c5208zf3 != null && c5208zf3.i == o70) {
                                                    c70.a();
                                                }
                                                sArr2 = sArr;
                                                i12 = i2;
                                                color3 = color;
                                                fArr8 = fArr5;
                                                fArr7 = fArr4;
                                                i11++;
                                                floatArray5 = floatArray5;
                                                z3 = z3;
                                                f8 = f8;
                                                objArr5 = objArr6;
                                                i10 = i13;
                                                g70 = g71;
                                                f5 = f5;
                                                f6 = f;
                                                f7 = f2;
                                                polygonSpriteBatch3 = polygonSpriteBatch;
                                                z4 = z4;
                                            } else {
                                                C5208zf c5208zf4 = c70.h;
                                                if (c5208zf4 != null && c5208zf4.i == o71) {
                                                    c70.a();
                                                }
                                                i11 = i11;
                                                f = f6;
                                                f2 = f7;
                                                z3 = z3;
                                                z4 = z4;
                                                f8 = f8;
                                                f5 = f5;
                                            }
                                            enumC2563La2 = enumC2563La2;
                                            polygonSpriteBatch = polygonSpriteBatch3;
                                            i11++;
                                            floatArray5 = floatArray5;
                                            z3 = z3;
                                            f8 = f8;
                                            objArr5 = objArr6;
                                            i10 = i13;
                                            g70 = g71;
                                            f5 = f5;
                                            f6 = f;
                                            f7 = f2;
                                            polygonSpriteBatch3 = polygonSpriteBatch;
                                            z4 = z4;
                                        }
                                        c70.a();
                                    } else {
                                        if (batch3 == null) {
                                            throw new IllegalArgumentException("batch cannot be null.");
                                        }
                                        if (c4991x72 == null) {
                                            throw new IllegalArgumentException("skeleton cannot be null.");
                                        }
                                        boolean z9 = g70.f3106a;
                                        boolean z10 = g70.b;
                                        float[] fArr19 = floatArray5.items;
                                        Color color5 = c4991x72.j;
                                        float f77 = color5.r;
                                        float f78 = color5.g;
                                        float f79 = color5.b;
                                        float f80 = color5.f202a;
                                        Array array9 = c4991x72.d;
                                        Object[] objArr11 = array9.items;
                                        int i80 = array9.size;
                                        int i81 = 0;
                                        EnumC2563La enumC2563La6 = null;
                                        while (i81 < i80) {
                                            N70 n71 = (N70) objArr11[i81];
                                            if (n71.b.A) {
                                                AbstractC3413f9 abstractC3413f10 = n71.e;
                                                i = i80;
                                                if (abstractC3413f10 instanceof C3527gY) {
                                                    C3527gY c3527gY2 = (C3527gY) abstractC3413f10;
                                                    c3527gY2.i(n71, fArr19, 5);
                                                    Color color6 = n71.c;
                                                    float f81 = color6.f202a * f80;
                                                    Color color7 = c3527gY2.m;
                                                    float f82 = f81 * color7.f202a * 255.0f;
                                                    float f83 = z9 ? f82 : 255.0f;
                                                    EnumC2563La enumC2563La7 = n71.f3442a.g;
                                                    if (enumC2563La7 != enumC2563La6) {
                                                        if (enumC2563La7 == EnumC2563La.additive && z9) {
                                                            enumC2563La6 = EnumC2563La.normal;
                                                            f82 = 0.0f;
                                                        } else {
                                                            enumC2563La6 = enumC2563La7;
                                                        }
                                                        int i82 = z10 ? enumC2563La6.b : enumC2563La6.f3358a;
                                                        int i83 = enumC2563La6.c;
                                                        batch3.setBlendFunctionSeparate(i82, i83, enumC2563La6.d, i83);
                                                    }
                                                    float fIntToFloatColor2 = NumberUtils.intToFloatColor((((int) f82) << 24) | (((int) (((color6.b * f79) * color7.b) * f83)) << 16) | (((int) (((color6.g * f78) * color7.g) * f83)) << 8) | ((int) (color6.r * f77 * color7.r * f83)));
                                                    int i84 = 0;
                                                    int i85 = 2;
                                                    while (i84 < 8) {
                                                        fArr19[i85] = fIntToFloatColor2;
                                                        float[] fArr20 = c3527gY2.k;
                                                        fArr19[i85 + 1] = fArr20[i84];
                                                        fArr19[i85 + 2] = fArr20[i84 + 1];
                                                        i84 += 2;
                                                        i85 += 5;
                                                    }
                                                    batch3.draw(c3527gY2.c.getTexture(), fArr19, 0, 20);
                                                } else {
                                                    z9 = z9;
                                                    z10 = z10;
                                                    if (abstractC3413f10 instanceof C5208zf) {
                                                        throw new RuntimeException(batch3.getClass().getSimpleName().concat(" cannot perform clipping, PolygonSpriteBatch or TwoColorPolygonBatch is required."));
                                                    }
                                                    if (abstractC3413f10 instanceof C3780jP) {
                                                        throw new RuntimeException(batch3.getClass().getSimpleName().concat(" cannot render meshes, PolygonSpriteBatch or TwoColorPolygonBatch is required."));
                                                    }
                                                }
                                            } else {
                                                z9 = z9;
                                                z10 = z10;
                                                i = i80;
                                            }
                                            i81++;
                                            i80 = i;
                                            objArr11 = objArr11;
                                            f80 = f80;
                                            z9 = z9;
                                            z10 = z10;
                                        }
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                }
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            th = th;
                        }
                    }
                    spineRenderAdapter = this;
                    Batch batch4 = spineRenderAdapter.builder.getBatchList().get(key);
                    if (batch4 != null) {
                        batch4.end();
                    }
                }
                return;
            } catch (Throwable th4) {
                th = th4;
            }
            th = th;
            throw th;
        }
    }

    @Override // com.badlogic.gdx.ApplicationListener
    public void resize(int i, int i2) {
        Iterator<Map.Entry<String, SpineData>> it = this.builder.getSpineDataMap().entrySet().iterator();
        while (it.hasNext()) {
            OrthographicCamera orthographicCamera = this.builder.getCameraList().get(it.next().getKey());
            if (orthographicCamera != null) {
                orthographicCamera.setToOrtho(false);
            }
        }
    }

    @Override // com.badlogic.gdx.ApplicationListener
    public void resume() {
        synchronized (this.MUTEX) {
            this.isPause = false;
            if (!this.builder.getAnimStateList().isEmpty()) {
                Iterator<Map.Entry<String, SpineData>> it = this.builder.getSpineDataMap().entrySet().iterator();
                while (it.hasNext()) {
                    C3843k5 c3843k5 = this.builder.getAnimStateList().get(it.next().getKey());
                    if (c3843k5 != null) {
                        c3843k5.h = 1.0f;
                    }
                }
            }
        }
    }

    @Override // com.badlogic.gdx.backends.android.IControl
    public void setAnimation(String str, int i, String str2, boolean z, float f, InterfaceC3581h5 interfaceC3581h5) {
        C3843k5 c3843k5;
        AbstractC2995aW.q(str2, "animationName");
        synchronized (this.MUTEX) {
            if (AbstractC2853Wf.d0(this.builder.getAnimStateList().keySet(), str) && (c3843k5 = this.builder.getAnimStateList().get(str)) != null) {
                try {
                    if (i >= c3843k5.b.size) {
                        return;
                    }
                    c3843k5.o(i, str2, z);
                    c3843k5.h = 1.0f;
                    if (interfaceC3581h5 != null) {
                        c3843k5.b(interfaceC3581h5);
                    }
                } catch (Throwable th) {
                    AbstractC3375el.v(th);
                }
            }
        }
    }

    @Override // com.badlogic.gdx.backends.android.IControl
    public void showAllSlot() {
        Iterator<Map.Entry<String, C4991x70>> it = this.builder.getSkeletonList().entrySet().iterator();
        while (it.hasNext()) {
            Array array = it.next().getValue().c;
            int i = array.size;
            for (int i2 = 0; i2 < i; i2++) {
                ((N70) array.get(i2)).c.f202a = 1.0f;
            }
        }
    }

    @Override // com.badlogic.gdx.backends.android.IControl
    public void showSlot(String str) {
        Array array;
        synchronized (this.MUTEX) {
            C4991x70 skeleton = getSkeleton(str);
            if (skeleton != null && (array = skeleton.c) != null) {
                Iterator<T> it = array.iterator();
                while (it.hasNext()) {
                    ((N70) it.next()).c.f202a = 1.0f;
                }
            }
        }
    }

    @Override // com.badlogic.gdx.backends.android.IControl
    public void showSlotExcludeRedSlots(String str, String str2) {
        C4991x70 skeleton;
        Array<N70> array;
        AbstractC2995aW.q(str2, "slotName");
        synchronized (this.MUTEX) {
            if (!AbstractC2995aW.i(str2, "banji_hong") && !AbstractC2995aW.i(str2, "banji2") && !AbstractC2995aW.i(str2, "jichui_hong") && !AbstractC2995aW.i(str2, "jichui2") && !AbstractC2995aW.i(str2, "dancao_hong") && !AbstractC2995aW.i(str2, "dancao2") && (skeleton = getSkeleton(str)) != null && (array = skeleton.c) != null) {
                for (N70 n70 : array) {
                    if (AbstractC2995aW.i(n70.f3442a.b, str2)) {
                        n70.c.f202a = 1.0f;
                    }
                }
            }
        }
    }

    @Override // com.badlogic.gdx.backends.android.IControl
    public void updateSpine(SpineActivity<?> spineActivity, String str, SpineData spineData) {
        AbstractC2995aW.q(spineActivity, "spineActivity");
        AbstractC2995aW.q(str, "key");
        AbstractC2995aW.q(spineData, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        synchronized (this.MUTEX) {
            this.isPause = true;
            try {
                dispose();
                this.builder.getSpineDataMap().put(str, spineData);
            } catch (Exception unused) {
            }
            this.builder.getSpineDataMap().size();
            ViewGroup parentView = this.builder.getParentView();
            if (parentView != null) {
                parentView.post(new RunnableC3976le0(7, spineActivity, this));
            }
        }
    }

    public final void dispose(String str) {
        AbstractC2995aW.q(str, "spineId");
        synchronized (this.MUTEX) {
            this.builder.release(str);
        }
    }

    @Override // com.badlogic.gdx.backends.android.IControl
    public void hideSlot(String str, String str2) {
        Array<N70> array;
        AbstractC2995aW.q(str2, "slotName");
        C4991x70 skeleton = getSkeleton(str);
        if (skeleton == null || (array = skeleton.c) == null) {
            return;
        }
        for (N70 n70 : array) {
            if (AbstractC2995aW.i(n70.f3442a.b, str2)) {
                n70.c.f202a = 0.0f;
            }
        }
    }

    @Override // com.badlogic.gdx.backends.android.IControl
    public void showSlot(String str, String str2) {
        Array<N70> array;
        AbstractC2995aW.q(str2, "slotName");
        synchronized (this.MUTEX) {
            C4991x70 skeleton = getSkeleton(str);
            if (skeleton != null && (array = skeleton.c) != null) {
                for (N70 n70 : array) {
                    if (AbstractC2995aW.i(n70.f3442a.b, str2)) {
                        n70.c.f202a = 1.0f;
                    }
                }
            }
        }
    }

    @Override // com.badlogic.gdx.backends.android.IControl
    public void addAnimation(int i, String str, boolean z, float f, InterfaceC3581h5 interfaceC3581h5) {
        IControl.DefaultImpls.addAnimation(this, i, str, z, f, interfaceC3581h5);
    }

    @Override // com.badlogic.gdx.backends.android.IControl
    public void showSlotExcludeRedSlots(String str) {
        Array<N70> array;
        synchronized (this.MUTEX) {
            C4991x70 skeleton = getSkeleton(str);
            if (skeleton != null && (array = skeleton.c) != null) {
                for (N70 n70 : array) {
                    if (!AbstractC2995aW.i(n70.f3442a.b, "banji_hong") && !AbstractC2995aW.i(n70.f3442a.b, "banji2") && !AbstractC2995aW.i(n70.f3442a.b, "jichui_hong") && !AbstractC2995aW.i(n70.f3442a.b, "jichui2") && !AbstractC2995aW.i(n70.f3442a.b, "dancao_hong") && !AbstractC2995aW.i(n70.f3442a.b, "dancao2")) {
                        n70.c.f202a = 1.0f;
                    }
                }
            }
        }
    }
}
