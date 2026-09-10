package com.mbridge.msdk.dycreator.wrapper;

import com.mbridge.msdk.dycreator.listener.DyCountDownListenerWrapper;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.File;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class DyOption {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<String> f33316a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private File f33317b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private CampaignEx f33318c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private DyAdType f33319d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f33320e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f33321f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f33322g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f33323h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f33324i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f33325j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f33326k;
    private int l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f33327m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f33328n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f33329o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f33330p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f33331q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private DyCountDownListenerWrapper f33332r;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static class Builder implements IViewOptionBuilder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private List<String> f33333a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private File f33334b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private CampaignEx f33335c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private DyAdType f33336d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f33337e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private String f33338f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f33339g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f33340h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private boolean f33341i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private boolean f33342j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private boolean f33343k;
        private int l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private int f33344m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private int f33345n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private int f33346o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private int f33347p;

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder adChoiceLink(String str) {
            this.f33338f = str;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public DyOption build() {
            return new DyOption(this);
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder campaignEx(CampaignEx campaignEx) {
            this.f33335c = campaignEx;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder canSkip(boolean z10) {
            this.f33337e = z10;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder countDownTime(int i10) {
            this.f33346o = i10;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder dyAdType(DyAdType dyAdType) {
            this.f33336d = dyAdType;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder file(File file) {
            this.f33334b = file;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder fileDirs(List<String> list) {
            this.f33333a = list;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder isApkInfoVisible(boolean z10) {
            this.f33342j = z10;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder isClickButtonVisible(boolean z10) {
            this.f33340h = z10;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder isLogoVisible(boolean z10) {
            this.f33343k = z10;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder isScreenClick(boolean z10) {
            this.f33339g = z10;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder isShakeVisible(boolean z10) {
            this.f33341i = z10;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder orientation(int i10) {
            this.f33345n = i10;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder shakeStrenght(int i10) {
            this.l = i10;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder shakeTime(int i10) {
            this.f33344m = i10;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder templateType(int i10) {
            this.f33347p = i10;
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public interface IViewOptionBuilder {
        IViewOptionBuilder adChoiceLink(String str);

        DyOption build();

        IViewOptionBuilder campaignEx(CampaignEx campaignEx);

        IViewOptionBuilder canSkip(boolean z10);

        IViewOptionBuilder countDownTime(int i10);

        IViewOptionBuilder dyAdType(DyAdType dyAdType);

        IViewOptionBuilder file(File file);

        IViewOptionBuilder fileDirs(List<String> list);

        IViewOptionBuilder isApkInfoVisible(boolean z10);

        IViewOptionBuilder isClickButtonVisible(boolean z10);

        IViewOptionBuilder isLogoVisible(boolean z10);

        IViewOptionBuilder isScreenClick(boolean z10);

        IViewOptionBuilder isShakeVisible(boolean z10);

        IViewOptionBuilder orientation(int i10);

        IViewOptionBuilder shakeStrenght(int i10);

        IViewOptionBuilder shakeTime(int i10);

        IViewOptionBuilder templateType(int i10);
    }

    public DyOption(Builder builder) {
        this.f33316a = builder.f33333a;
        this.f33317b = builder.f33334b;
        this.f33318c = builder.f33335c;
        this.f33319d = builder.f33336d;
        this.f33322g = builder.f33337e;
        this.f33320e = builder.f33338f;
        this.f33321f = builder.f33339g;
        this.f33323h = builder.f33340h;
        this.f33325j = builder.f33342j;
        this.f33324i = builder.f33341i;
        this.f33326k = builder.f33343k;
        this.l = builder.l;
        this.f33327m = builder.f33344m;
        this.f33328n = builder.f33345n;
        this.f33329o = builder.f33346o;
        this.f33331q = builder.f33347p;
    }

    public String getAdChoiceLink() {
        return this.f33320e;
    }

    public CampaignEx getCampaignEx() {
        return this.f33318c;
    }

    public int getCountDownTime() {
        return this.f33329o;
    }

    public int getCurrentCountDown() {
        return this.f33330p;
    }

    public DyAdType getDyAdType() {
        return this.f33319d;
    }

    public File getFile() {
        return this.f33317b;
    }

    public List<String> getFileDirs() {
        return this.f33316a;
    }

    public int getOrientation() {
        return this.f33328n;
    }

    public int getShakeStrenght() {
        return this.l;
    }

    public int getShakeTime() {
        return this.f33327m;
    }

    public int getTemplateType() {
        return this.f33331q;
    }

    public boolean isApkInfoVisible() {
        return this.f33325j;
    }

    public boolean isCanSkip() {
        return this.f33322g;
    }

    public boolean isClickButtonVisible() {
        return this.f33323h;
    }

    public boolean isClickScreen() {
        return this.f33321f;
    }

    public boolean isLogoVisible() {
        return this.f33326k;
    }

    public boolean isShakeVisible() {
        return this.f33324i;
    }

    public void setDyCountDownListener(int i10) {
        DyCountDownListenerWrapper dyCountDownListenerWrapper = this.f33332r;
        if (dyCountDownListenerWrapper != null) {
            dyCountDownListenerWrapper.getCountDownValue(i10);
        }
        this.f33330p = i10;
    }

    public void setDyCountDownListenerWrapper(DyCountDownListenerWrapper dyCountDownListenerWrapper) {
        this.f33332r = dyCountDownListenerWrapper;
    }
}
