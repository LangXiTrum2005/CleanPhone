package com.badlogic.gdx.backends.android;

import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3843k5;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4019m5;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4991x70;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.F70;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3581h5;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.N70;

/* JADX INFO: loaded from: classes.dex */
public interface IControl {

    public static final class DefaultImpls {
        public static void addAnimation(IControl iControl, int i, String str, boolean z, float f, InterfaceC3581h5 interfaceC3581h5) {
            AbstractC2995aW.q(str, "animationName");
            iControl.addAnimation(null, i, str, z, f, interfaceC3581h5);
        }

        public static /* synthetic */ void addAnimation$default(IControl iControl, int i, String str, boolean z, float f, InterfaceC3581h5 interfaceC3581h5, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addAnimation");
            }
            boolean z2 = (i2 & 4) != 0 ? false : z;
            float f2 = (i2 & 8) != 0 ? 0.0f : f;
            if ((i2 & 16) != 0) {
                interfaceC3581h5 = null;
            }
            iControl.addAnimation(i, str, z2, f2, interfaceC3581h5);
        }

        public static /* synthetic */ N70 findSlot$default(IControl iControl, String str, String str2, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: findSlot");
            }
            if ((i & 1) != 0) {
                str = null;
            }
            return iControl.findSlot(str, str2);
        }

        public static /* synthetic */ C3843k5 getAnimationState$default(IControl iControl, String str, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAnimationState");
            }
            if ((i & 1) != 0) {
                str = null;
            }
            return iControl.getAnimationState(str);
        }

        public static /* synthetic */ C4019m5 getAnimationStateData$default(IControl iControl, String str, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAnimationStateData");
            }
            if ((i & 1) != 0) {
                str = null;
            }
            return iControl.getAnimationStateData(str);
        }

        public static /* synthetic */ TextureAtlas getAtlas$default(IControl iControl, String str, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAtlas");
            }
            if ((i & 1) != 0) {
                str = null;
            }
            return iControl.getAtlas(str);
        }

        public static /* synthetic */ C4991x70 getSkeleton$default(IControl iControl, String str, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getSkeleton");
            }
            if ((i & 1) != 0) {
                str = null;
            }
            return iControl.getSkeleton(str);
        }

        public static /* synthetic */ F70 getSkeletonLoader$default(IControl iControl, String str, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getSkeletonLoader");
            }
            if ((i & 1) != 0) {
                str = null;
            }
            return iControl.getSkeletonLoader(str);
        }

        public static /* synthetic */ void hideSlot$default(IControl iControl, String str, String str2, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: hideSlot");
            }
            if ((i & 1) != 0) {
                str = null;
            }
            iControl.hideSlot(str, str2);
        }

        public static /* synthetic */ void setAnimation$default(IControl iControl, String str, int i, String str2, boolean z, float f, InterfaceC3581h5 interfaceC3581h5, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setAnimation");
            }
            iControl.setAnimation((i2 & 1) != 0 ? null : str, i, str2, (i2 & 8) != 0 ? false : z, (i2 & 16) != 0 ? 0.0f : f, (i2 & 32) != 0 ? null : interfaceC3581h5);
        }

        public static /* synthetic */ void showSlot$default(IControl iControl, String str, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showSlot");
            }
            if ((i & 1) != 0) {
                str = null;
            }
            iControl.showSlot(str);
        }

        public static /* synthetic */ void showSlotExcludeRedSlots$default(IControl iControl, String str, String str2, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showSlotExcludeRedSlots");
            }
            if ((i & 1) != 0) {
                str = null;
            }
            iControl.showSlotExcludeRedSlots(str, str2);
        }

        public static /* synthetic */ void showSlot$default(IControl iControl, String str, String str2, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showSlot");
            }
            if ((i & 1) != 0) {
                str = null;
            }
            iControl.showSlot(str, str2);
        }

        public static /* synthetic */ void showSlotExcludeRedSlots$default(IControl iControl, String str, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showSlotExcludeRedSlots");
            }
            if ((i & 1) != 0) {
                str = null;
            }
            iControl.showSlotExcludeRedSlots(str);
        }

        public static /* synthetic */ void addAnimation$default(IControl iControl, String str, int i, String str2, boolean z, float f, InterfaceC3581h5 interfaceC3581h5, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addAnimation");
            }
            iControl.addAnimation((i2 & 1) != 0 ? null : str, i, str2, (i2 & 8) != 0 ? false : z, (i2 & 16) != 0 ? 0.0f : f, (i2 & 32) != 0 ? null : interfaceC3581h5);
        }
    }

    void addAnimation(int i, String str, boolean z, float f, InterfaceC3581h5 interfaceC3581h5);

    void addAnimation(String str, int i, String str2, boolean z, float f, InterfaceC3581h5 interfaceC3581h5);

    N70 findSlot(String str, String str2);

    C3843k5 getAnimationState(String str);

    C4019m5 getAnimationStateData(String str);

    TextureAtlas getAtlas(String str);

    C4991x70 getSkeleton(String str);

    F70 getSkeletonLoader(String str);

    void hideAllSlot();

    void hideSlot(String str);

    void hideSlot(String str, String str2);

    void setAnimation(String str, int i, String str2, boolean z, float f, InterfaceC3581h5 interfaceC3581h5);

    void showAllSlot();

    void showSlot(String str);

    void showSlot(String str, String str2);

    void showSlotExcludeRedSlots(String str);

    void showSlotExcludeRedSlots(String str, String str2);

    void updateSpine(SpineActivity<?> spineActivity, String str, SpineData spineData);
}
