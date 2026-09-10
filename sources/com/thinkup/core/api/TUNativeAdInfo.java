package com.thinkup.core.api;

import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public interface TUNativeAdInfo {

    public interface AdController {
        void pauseVideo();

        void resumeVideo();

        void setVideoMute(boolean z2);
    }

    public static class AdPrepareInfo {
        private View adFromView;
        private View adLogoView;
        private List<View> appInfoClickViewList;
        FrameLayout.LayoutParams choiceViewLayoutParams;
        private final List<View> clickViewList = new ArrayList();
        private View closeView;
        private List<View> creativeClickViewList;
        private View ctaView;
        private View descView;
        private View domainView;
        private View iconView;
        private View mainImageView;
        private View parentView;
        private List<View> permissionClickViewList;
        private List<View> privacyClickViewList;
        private View titleView;
        private View warningView;

        private synchronized void addClickView(View view) {
            if (view == null) {
                return;
            }
            if (!this.clickViewList.contains(view)) {
                View view2 = this.closeView;
                if (view2 != null && view2 == view) {
                } else {
                    this.clickViewList.add(view);
                }
            }
        }

        private synchronized void filterCloseView(List<View> list) {
            View view;
            if (list != null) {
                if (list.size() > 0 && (view = this.closeView) != null) {
                    list.remove(view);
                }
            }
        }

        public View getAdFromView() {
            return this.adFromView;
        }

        public View getAdLogoView() {
            return this.adLogoView;
        }

        public List<View> getAppInfoClickViewList() {
            filterCloseView(this.appInfoClickViewList);
            return this.appInfoClickViewList;
        }

        public FrameLayout.LayoutParams getChoiceViewLayoutParams() {
            return this.choiceViewLayoutParams;
        }

        public List<View> getClickViewList() {
            return this.clickViewList;
        }

        public View getCloseView() {
            return this.closeView;
        }

        public List<View> getCreativeClickViewList() {
            filterCloseView(this.creativeClickViewList);
            return this.creativeClickViewList;
        }

        public View getCtaView() {
            return this.ctaView;
        }

        public View getDescView() {
            return this.descView;
        }

        public View getDomainView() {
            return this.domainView;
        }

        public View getIconView() {
            return this.iconView;
        }

        public View getMainImageView() {
            return this.mainImageView;
        }

        public View getParentView() {
            return this.parentView;
        }

        public List<View> getPermissionClickViewList() {
            filterCloseView(this.permissionClickViewList);
            return this.permissionClickViewList;
        }

        public List<View> getPrivacyClickViewList() {
            filterCloseView(this.privacyClickViewList);
            return this.privacyClickViewList;
        }

        public View getTitleView() {
            return this.titleView;
        }

        public View getWarningView() {
            return this.warningView;
        }

        public void setAdFromView(View view) {
            this.adFromView = view;
        }

        public void setAdLogoView(View view) {
            this.adLogoView = view;
        }

        public void setAppInfoClickViewList(List<View> list) {
            this.appInfoClickViewList = list;
        }

        public void setChoiceViewLayoutParams(FrameLayout.LayoutParams layoutParams) {
            this.choiceViewLayoutParams = layoutParams;
        }

        public void setClickViewList(List<View> list) {
            if (list == null || list.size() <= 0) {
                return;
            }
            Iterator<View> it = list.iterator();
            while (it.hasNext()) {
                addClickView(it.next());
            }
        }

        public void setCloseView(View view) {
            this.closeView = view;
        }

        public void setCreativeClickViewList(List<View> list) {
            this.creativeClickViewList = list;
        }

        public void setCtaView(View view) {
            this.ctaView = view;
            addClickView(view);
        }

        public void setDescView(View view) {
            this.descView = view;
            addClickView(view);
        }

        public void setDomainView(View view) {
            this.domainView = view;
        }

        public void setIconView(View view) {
            this.iconView = view;
            addClickView(view);
        }

        public void setMainImageView(View view) {
            this.mainImageView = view;
            addClickView(view);
        }

        public void setParentView(View view) {
            this.parentView = view;
        }

        public void setPermissionClickViewList(List<View> list) {
            this.permissionClickViewList = list;
        }

        public void setPrivacyClickViewList(List<View> list) {
            this.privacyClickViewList = list;
        }

        public void setTitleView(View view) {
            this.titleView = view;
            addClickView(view);
        }

        public void setWarningView(View view) {
            this.warningView = view;
        }
    }

    AdController getAdController();

    ITUThirdPartyMaterial getAdMaterial();

    void prepare(AdPrepareInfo adPrepareInfo);
}
