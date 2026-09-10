package com.badlogic.gdx.backends.android;

import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2471Hm;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3375el;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4520rn;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3843k5;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4019m5;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4991x70;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4602sk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.F70;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.G70;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2857Wj;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3581h5;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.N70;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class SpineController implements IControl {
    private final SpineRenderAdapter renderAdapter;

    public interface SpineAnimationCallback {
        void onSpineAnimationChanged(SpineController spineController, View view);
    }

    public /* synthetic */ SpineController(SpineRenderAdapter spineRenderAdapter, AbstractC2471Hm abstractC2471Hm) {
        this(spineRenderAdapter);
    }

    @Override // com.badlogic.gdx.backends.android.IControl
    public void addAnimation(String str, int i, String str2, boolean z, float f, InterfaceC3581h5 interfaceC3581h5) {
        AbstractC2995aW.q(str2, "animationName");
        this.renderAdapter.addAnimation(str, i, str2, z, f, interfaceC3581h5);
    }

    public final void dispose() {
        this.renderAdapter.dispose();
    }

    @Override // com.badlogic.gdx.backends.android.IControl
    public N70 findSlot(String str, String str2) {
        AbstractC2995aW.q(str2, "slotName");
        return this.renderAdapter.findSlot(str, str2);
    }

    @Override // com.badlogic.gdx.backends.android.IControl
    public C3843k5 getAnimationState(String str) {
        return this.renderAdapter.getAnimationState(str);
    }

    @Override // com.badlogic.gdx.backends.android.IControl
    public C4019m5 getAnimationStateData(String str) {
        return this.renderAdapter.getAnimationStateData(str);
    }

    @Override // com.badlogic.gdx.backends.android.IControl
    public TextureAtlas getAtlas(String str) {
        return this.renderAdapter.getAtlas(str);
    }

    @Override // com.badlogic.gdx.backends.android.IControl
    public C4991x70 getSkeleton(String str) {
        return this.renderAdapter.getSkeleton(str);
    }

    @Override // com.badlogic.gdx.backends.android.IControl
    public F70 getSkeletonLoader(String str) {
        return this.renderAdapter.getSkeletonLoader(str);
    }

    @Override // com.badlogic.gdx.backends.android.IControl
    public void hideAllSlot() {
        this.renderAdapter.hideAllSlot();
    }

    @Override // com.badlogic.gdx.backends.android.IControl
    public void hideSlot(String str) {
        this.renderAdapter.hideSlot(str);
    }

    public final void pause() {
        this.renderAdapter.pause();
    }

    public final void pauseSpine(String str) {
        AbstractC2995aW.q(str, "spineId");
        this.renderAdapter.pauseSpine(str);
    }

    public final void resume() {
        this.renderAdapter.resume();
    }

    @Override // com.badlogic.gdx.backends.android.IControl
    public void setAnimation(String str, int i, String str2, boolean z, float f, InterfaceC3581h5 interfaceC3581h5) {
        AbstractC2995aW.q(str2, "animationName");
        this.renderAdapter.setAnimation(str, i, str2, z, f, interfaceC3581h5);
    }

    @Override // com.badlogic.gdx.backends.android.IControl
    public void showAllSlot() {
        this.renderAdapter.showAllSlot();
    }

    @Override // com.badlogic.gdx.backends.android.IControl
    public void showSlot(String str) {
        this.renderAdapter.showSlot(str);
    }

    @Override // com.badlogic.gdx.backends.android.IControl
    public void showSlotExcludeRedSlots(String str, String str2) {
        AbstractC2995aW.q(str2, "slotName");
        this.renderAdapter.showSlotExcludeRedSlots(str, str2);
    }

    @Override // com.badlogic.gdx.backends.android.IControl
    public void updateSpine(SpineActivity<?> spineActivity, String str, SpineData spineData) {
        AbstractC2995aW.q(spineActivity, "spineActivity");
        AbstractC2995aW.q(str, "key");
        AbstractC2995aW.q(spineData, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        this.renderAdapter.updateSpine(spineActivity, str, spineData);
    }

    private SpineController(SpineRenderAdapter spineRenderAdapter) {
        this.renderAdapter = spineRenderAdapter;
    }

    @Override // com.badlogic.gdx.backends.android.IControl
    public void hideSlot(String str, String str2) {
        AbstractC2995aW.q(str2, "slotName");
        this.renderAdapter.hideSlot(str, str2);
    }

    @Override // com.badlogic.gdx.backends.android.IControl
    public void showSlot(String str, String str2) {
        AbstractC2995aW.q(str2, "slotName");
        this.renderAdapter.showSlot(str, str2);
    }

    @Override // com.badlogic.gdx.backends.android.IControl
    public void showSlotExcludeRedSlots(String str) {
        this.renderAdapter.showSlotExcludeRedSlots(str);
    }

    @Override // com.badlogic.gdx.backends.android.IControl
    public void addAnimation(int i, String str, boolean z, float f, InterfaceC3581h5 interfaceC3581h5) {
        IControl.DefaultImpls.addAnimation(this, i, str, z, f, interfaceC3581h5);
    }

    public static final class Builder {
        private final String TAG;
        private Map<String, C3843k5> animStateList;
        private Map<String, TextureAtlas> atlasList;
        private Map<String, Batch> batchList;
        private SpineAnimationCallback callback;
        private Map<String, OrthographicCamera> cameraList;
        private SpineController controller;
        private ViewGroup.LayoutParams layoutParams;
        private ViewGroup parentView;
        private Map<String, G70> rendererList;
        private Map<String, C4991x70> skeletonList;
        private Map<String, F70> skeletonLoaderList;
        private Map<String, SpineData> spineDataMap;
        private View spineView;

        public Builder(HashMap<String, SpineData> map) {
            AbstractC2995aW.q(map, "spineData");
            this.TAG = "SpineControllerBuilder";
            this.cameraList = new HashMap();
            this.rendererList = new HashMap();
            this.animStateList = new HashMap();
            this.batchList = new HashMap();
            this.skeletonList = new HashMap();
            this.atlasList = new HashMap();
            this.skeletonLoaderList = new HashMap();
            this.spineDataMap = new LinkedHashMap();
            this.layoutParams = new ViewGroup.LayoutParams(-1, -1);
            this.spineDataMap = map;
        }

        public static /* synthetic */ Builder addSpineView$default(Builder builder, ViewGroup viewGroup, ViewGroup.LayoutParams layoutParams, int i, Object obj) {
            if ((i & 2) != 0) {
                layoutParams = new ViewGroup.LayoutParams(-1, -1);
            }
            return builder.addSpineView(viewGroup, layoutParams);
        }

        public static /* synthetic */ Object build$default(Builder builder, SpineActivity spineActivity, AndroidApplicationConfiguration androidApplicationConfiguration, InterfaceC2857Wj interfaceC2857Wj, int i, Object obj) {
            if ((i & 2) != 0) {
                androidApplicationConfiguration = new AndroidApplicationConfiguration();
                androidApplicationConfiguration.useGL30 = true;
                androidApplicationConfiguration.f201a = 8;
                androidApplicationConfiguration.b = 8;
                androidApplicationConfiguration.g = 8;
                androidApplicationConfiguration.r = 8;
            }
            return builder.build(spineActivity, androidApplicationConfiguration, interfaceC2857Wj);
        }

        public final Builder addSpineView(ViewGroup viewGroup, ViewGroup.LayoutParams layoutParams) {
            AbstractC2995aW.q(viewGroup, "parentView");
            AbstractC2995aW.q(layoutParams, "params");
            this.parentView = viewGroup;
            this.layoutParams = layoutParams;
            return this;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        public final Object build(SpineActivity<?> spineActivity, AndroidApplicationConfiguration androidApplicationConfiguration, InterfaceC2857Wj interfaceC2857Wj) {
            SpineController$Builder$build$1 spineController$Builder$build$1;
            final Builder builder;
            SpineActivity<?> spineActivity2;
            final SpineController spineController;
            if (interfaceC2857Wj instanceof SpineController$Builder$build$1) {
                spineController$Builder$build$1 = (SpineController$Builder$build$1) interfaceC2857Wj;
                int i = spineController$Builder$build$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    spineController$Builder$build$1.label = i - Integer.MIN_VALUE;
                } else {
                    spineController$Builder$build$1 = new SpineController$Builder$build$1(this, interfaceC2857Wj);
                }
            } else {
                spineController$Builder$build$1 = new SpineController$Builder$build$1(this, interfaceC2857Wj);
            }
            Object objInitializeForView = spineController$Builder$build$1.result;
            EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
            int i2 = spineController$Builder$build$1.label;
            if (i2 == 0) {
                AbstractC3375el.b0(objInitializeForView);
                SpineRenderAdapter spineRenderAdapter = new SpineRenderAdapter(this);
                SpineController spineController2 = new SpineController(spineRenderAdapter, null);
                if (this.parentView == null) {
                    return spineController2;
                }
                spineController$Builder$build$1.L$0 = this;
                spineController$Builder$build$1.L$1 = spineActivity;
                spineController$Builder$build$1.L$2 = spineController2;
                spineController$Builder$build$1.label = 1;
                objInitializeForView = spineActivity.initializeForView(spineRenderAdapter, androidApplicationConfiguration, spineController$Builder$build$1);
                if (objInitializeForView == enumC4602sk) {
                    return enumC4602sk;
                }
                builder = this;
                spineActivity2 = spineActivity;
                spineController = spineController2;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                spineController = (SpineController) spineController$Builder$build$1.L$2;
                spineActivity2 = (SpineActivity) spineController$Builder$build$1.L$1;
                builder = (Builder) spineController$Builder$build$1.L$0;
                AbstractC3375el.b0(objInitializeForView);
            }
            View view = (View) objInitializeForView;
            builder.controller = spineController;
            builder.spineView = view;
            if (view instanceof SurfaceView) {
                SurfaceView surfaceView = (SurfaceView) view;
                surfaceView.getHolder().setFormat(-3);
                surfaceView.setZOrderMediaOverlay(true);
            }
            ViewGroup viewGroup = builder.parentView;
            if (viewGroup == null) {
                throw new RuntimeException("parentView must not be null");
            }
            if (viewGroup != null) {
                viewGroup.addView(view, builder.layoutParams);
            }
            spineActivity2.getLifecycle().addObserver(new DefaultLifecycleObserver() { // from class: com.badlogic.gdx.backends.android.SpineController$Builder$build$3
                @Override // androidx.lifecycle.DefaultLifecycleObserver
                public final /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
                    AbstractC4520rn.a(this, lifecycleOwner);
                }

                @Override // androidx.lifecycle.DefaultLifecycleObserver
                public void onDestroy(LifecycleOwner lifecycleOwner) {
                    AbstractC2995aW.q(lifecycleOwner, "owner");
                    this.this$0.getSpineDataMap().clear();
                    ViewGroup parentView = this.this$0.getParentView();
                    if (parentView != null) {
                        parentView.removeAllViews();
                    }
                    this.this$0.setParentView(null);
                    spineController.dispose();
                }

                @Override // androidx.lifecycle.DefaultLifecycleObserver
                public final /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
                    AbstractC4520rn.c(this, lifecycleOwner);
                }

                @Override // androidx.lifecycle.DefaultLifecycleObserver
                public final /* synthetic */ void onResume(LifecycleOwner lifecycleOwner) {
                    AbstractC4520rn.d(this, lifecycleOwner);
                }

                @Override // androidx.lifecycle.DefaultLifecycleObserver
                public final /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
                    AbstractC4520rn.e(this, lifecycleOwner);
                }

                @Override // androidx.lifecycle.DefaultLifecycleObserver
                public final /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
                    AbstractC4520rn.f(this, lifecycleOwner);
                }
            });
            return spineController;
        }

        public final Map<String, C3843k5> getAnimStateList() {
            return this.animStateList;
        }

        public final Map<String, TextureAtlas> getAtlasList() {
            return this.atlasList;
        }

        public final Map<String, Batch> getBatchList() {
            return this.batchList;
        }

        public final SpineAnimationCallback getCallback() {
            return this.callback;
        }

        public final Map<String, OrthographicCamera> getCameraList() {
            return this.cameraList;
        }

        public final SpineController getController() {
            return this.controller;
        }

        public final ViewGroup.LayoutParams getLayoutParams() {
            return this.layoutParams;
        }

        public final ViewGroup getParentView() {
            return this.parentView;
        }

        public final Map<String, G70> getRendererList() {
            return this.rendererList;
        }

        public final Map<String, C4991x70> getSkeletonList() {
            return this.skeletonList;
        }

        public final Map<String, F70> getSkeletonLoaderList() {
            return this.skeletonLoaderList;
        }

        public final Map<String, SpineData> getSpineDataMap() {
            return this.spineDataMap;
        }

        public final View getSpineView() {
            return this.spineView;
        }

        public final void release() {
            this.cameraList.clear();
            this.rendererList.clear();
            Iterator<Map.Entry<String, C3843k5>> it = this.animStateList.entrySet().iterator();
            while (it.hasNext()) {
                it.next().getValue().g();
            }
            this.animStateList.clear();
            Iterator<Map.Entry<String, Batch>> it2 = this.batchList.entrySet().iterator();
            while (it2.hasNext()) {
                it2.next().getValue().dispose();
            }
            this.batchList.clear();
            this.skeletonList.clear();
            Iterator<Map.Entry<String, TextureAtlas>> it3 = this.atlasList.entrySet().iterator();
            while (it3.hasNext()) {
                it3.next().getValue().dispose();
            }
            this.atlasList.clear();
            this.skeletonLoaderList.clear();
        }

        public final void setAnimStateList(Map<String, C3843k5> map) {
            AbstractC2995aW.q(map, "<set-?>");
            this.animStateList = map;
        }

        public final void setAtlasList(Map<String, TextureAtlas> map) {
            AbstractC2995aW.q(map, "<set-?>");
            this.atlasList = map;
        }

        public final void setBatchList(Map<String, Batch> map) {
            AbstractC2995aW.q(map, "<set-?>");
            this.batchList = map;
        }

        public final void setCallback(SpineAnimationCallback spineAnimationCallback) {
            this.callback = spineAnimationCallback;
        }

        public final void setCameraList(Map<String, OrthographicCamera> map) {
            AbstractC2995aW.q(map, "<set-?>");
            this.cameraList = map;
        }

        public final void setController(SpineController spineController) {
            this.controller = spineController;
        }

        public final void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
            AbstractC2995aW.q(layoutParams, "<set-?>");
            this.layoutParams = layoutParams;
        }

        public final void setParentView(ViewGroup viewGroup) {
            this.parentView = viewGroup;
        }

        public final void setRendererList(Map<String, G70> map) {
            AbstractC2995aW.q(map, "<set-?>");
            this.rendererList = map;
        }

        public final void setSkeletonList(Map<String, C4991x70> map) {
            AbstractC2995aW.q(map, "<set-?>");
            this.skeletonList = map;
        }

        public final void setSkeletonLoaderList(Map<String, F70> map) {
            AbstractC2995aW.q(map, "<set-?>");
            this.skeletonLoaderList = map;
        }

        public final Builder setSpineAnimationCallback(SpineAnimationCallback spineAnimationCallback) {
            this.callback = spineAnimationCallback;
            return this;
        }

        public final void setSpineDataMap(Map<String, SpineData> map) {
            AbstractC2995aW.q(map, "<set-?>");
            this.spineDataMap = map;
        }

        public final void setSpineView(View view) {
            this.spineView = view;
        }

        public final void release(String str) {
            TextureAtlas textureAtlas;
            C3843k5 value;
            Batch value2;
            AbstractC2995aW.q(str, "spineId");
            this.cameraList.remove(str);
            this.rendererList.remove(str);
            Iterator<Map.Entry<String, C3843k5>> it = this.animStateList.entrySet().iterator();
            do {
                textureAtlas = null;
                if (!it.hasNext()) {
                    value = null;
                    break;
                } else {
                    Map.Entry<String, C3843k5> next = it.next();
                    value = AbstractC2995aW.i(str, next.getKey()) ? next.getValue() : null;
                }
            } while (value == null);
            if (value != null) {
                value.g();
            }
            this.animStateList.remove(str);
            Iterator<Map.Entry<String, Batch>> it2 = this.batchList.entrySet().iterator();
            do {
                if (!it2.hasNext()) {
                    value2 = null;
                    break;
                } else {
                    Map.Entry<String, Batch> next2 = it2.next();
                    value2 = AbstractC2995aW.i(str, next2.getKey()) ? next2.getValue() : null;
                }
            } while (value2 == null);
            if (value2 != null) {
                value2.dispose();
            }
            this.batchList.remove(str);
            this.skeletonList.remove(str);
            for (Map.Entry<String, TextureAtlas> entry : this.atlasList.entrySet()) {
                TextureAtlas value3 = AbstractC2995aW.i(str, entry.getKey()) ? entry.getValue() : null;
                if (value3 != null) {
                    textureAtlas = value3;
                    break;
                }
            }
            if (textureAtlas != null) {
                textureAtlas.dispose();
            }
            this.atlasList.remove(str);
            this.skeletonLoaderList.remove(str);
            this.spineDataMap.remove(str);
        }
    }
}
