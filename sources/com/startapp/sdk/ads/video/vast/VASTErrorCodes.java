package com.startapp.sdk.ads.video.vast;

import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.p004ironsource.mediationsdk.logger.IronSourceError;
import com.smartdigimkt.sdk.basead.ui.BaseATView;

/* JADX INFO: loaded from: classes6.dex */
public enum VASTErrorCodes {
    ErrorNone(0),
    XMLParsingError(100),
    /* JADX INFO: Fake field, exist only in values array */
    SchemaValidationError(101),
    /* JADX INFO: Fake field, exist only in values array */
    VersionOfResponseNotSupported(102),
    /* JADX INFO: Fake field, exist only in values array */
    TraffickingError(200),
    /* JADX INFO: Fake field, exist only in values array */
    VideoPlayerExpectingDifferentLinearity(201),
    /* JADX INFO: Fake field, exist only in values array */
    VideoPlayerExpectingDifferentDuration(202),
    /* JADX INFO: Fake field, exist only in values array */
    VideoPlayerExpectingDifferentSize(203),
    /* JADX INFO: Fake field, exist only in values array */
    AdCategoryRequired(204),
    /* JADX INFO: Fake field, exist only in values array */
    GeneralWrapperError(300),
    WrapperTimeout(301),
    /* JADX INFO: Fake field, exist only in values array */
    WrapperLimitReached(302),
    WrapperNoReponse(BaseATView.g.f38290N),
    /* JADX INFO: Fake field, exist only in values array */
    InlineResponseTimeout(304),
    GeneralLinearError(400),
    FileNotFound(401),
    TimeoutMediaFileURI(TTAdConstant.AD_ID_IS_NULL_CODE),
    /* JADX INFO: Fake field, exist only in values array */
    GeneralVPAIDerror(403),
    MediaFileDisplayError(405),
    /* JADX INFO: Fake field, exist only in values array */
    GeneralVPAIDerror(406),
    /* JADX INFO: Fake field, exist only in values array */
    SAShowBeforeVast(407),
    /* JADX INFO: Fake field, exist only in values array */
    GeneralVPAIDerror(408),
    /* JADX INFO: Fake field, exist only in values array */
    SAShowBeforeVast(409),
    /* JADX INFO: Fake field, exist only in values array */
    GeneralVPAIDerror(410),
    /* JADX INFO: Fake field, exist only in values array */
    SAShowBeforeVast(411),
    /* JADX INFO: Fake field, exist only in values array */
    GeneralVPAIDerror(500),
    /* JADX INFO: Fake field, exist only in values array */
    SAShowBeforeVast(501),
    /* JADX INFO: Fake field, exist only in values array */
    GeneralVPAIDerror(502),
    /* JADX INFO: Fake field, exist only in values array */
    SAShowBeforeVast(503),
    /* JADX INFO: Fake field, exist only in values array */
    GeneralVPAIDerror(600),
    /* JADX INFO: Fake field, exist only in values array */
    SAShowBeforeVast(IronSourceError.ERROR_BN_LOAD_AFTER_LONG_INITIATION),
    /* JADX INFO: Fake field, exist only in values array */
    GeneralVPAIDerror(IronSourceError.ERROR_BN_INIT_FAILED_AFTER_LOAD),
    /* JADX INFO: Fake field, exist only in values array */
    SAShowBeforeVast(IronSourceError.ERROR_BN_LOAD_WHILE_LONG_INITIATION),
    /* JADX INFO: Fake field, exist only in values array */
    GeneralVPAIDerror(IronSourceError.ERROR_BN_LOAD_PLACEMENT_CAPPED),
    UndefinedError(com.smartdigimkt.o1.b.z1),
    /* JADX INFO: Fake field, exist only in values array */
    GeneralVPAIDerror(901),
    /* JADX INFO: Fake field, exist only in values array */
    SAShowBeforeVast(10000),
    SAProcessSuccess(20000);

    private int value;

    VASTErrorCodes(int i2) {
        this.value = i2;
    }

    public final int a() {
        return this.value;
    }
}
