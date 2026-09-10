package ads_mobile_sdk;

import saneness.cyclery;
import saneness.salutatory;

/* JADX INFO: loaded from: classes.dex */
public enum po0 implements salutatory {
    GMSG_NAME_UNKNOWN(0),
    GMSG_NAME_SDK_CORE_LOADED(1),
    GMSG_NAME_RESULT(2),
    GMSG_NAME_OPEN(3),
    GMSG_NAME_CLICK(4),
    GMSG_NAME_HTTP_TRACK(5),
    GMSG_NAME_REFRESH(6),
    GMSG_DELAY_PAGE_LOADED(7),
    GMSG_DELAY_PAGE_CLOSED(15),
    GMSG_VIDEO_METADATA(8),
    GMSG_VIDEO(33),
    GMSG_UPDATE_CONSENT_ALLOWLIST(9),
    GMSG_APP_EVENT(10),
    /* JADX INFO: Fake field, exist only in values array */
    GMSG_TOUCH_EVENT(14),
    GMSG_INTERSTITIAL_PROPERTIES(11),
    GMSG_CUSTOM_CLOSE(12),
    GMSG_CLOSE(13),
    GMSG_BACK_BUTTON(16),
    GMSG_REWARD(17),
    GMSG_AD_METADATA_CHANGED(18),
    GMSG_INSTRUMENT(19),
    GMSG_CAN_OPEN_URLS(20),
    GMSG_H5(21),
    GMSG_VIEW_LOCATION(22),
    GMSG_MRAID_LOADED(23),
    GMSG_MRAID(24),
    GMSG_RESET_PAID(25),
    GMSG_SET_PAIDV2_PERSONALIZATION_ENABLED(26),
    GMSG_LOG(27),
    GMSG_NATIVE_IMPRESSION(28),
    GMSG_TRACK_ACTIVE_VIEW_UNIT(29),
    GMSG_UNTRACK_ACTIVE_VIEW_UNIT(30),
    GMSG_CAN_OPEN_INTENTS(31),
    GMSG_CAN_OPEN_APP(32),
    GMSG_CUSTOM_CLICK(34),
    GMSG_NATIVE_CLICK_RECORDED(35),
    GMSG_NATIVE_AD_VIEW_SIGNALS(36),
    GMSG_NATIVE_CLICK_META(37),
    GMSG_NATIVE_VIDEO_CLICKED(38),
    GMSG_INSPECTOR_SET_APPLICATION_STATE(55),
    GMSG_INSPECTOR_SINGLE_AD_SOURCE_TEST(39),
    GMSG_INSPECTOR_UI_STORAGE(40),
    GMSG_SHARE_SHEET(41),
    GMSG_OUT_OF_CONTEXT_TESTING(42),
    GMSG_HIDE_OVERLAY(43),
    GMSG_SHOW_OVERLAY(44),
    GMSG_LOAD_OVERLAY_HTML(45),
    GMSG_SEND_MESSAGE_TO_NATIVE_JS(46),
    GMSG_LOG_SCION_EVENT(47),
    GMSG_HIDE_VALIDATOR_OVERLAY(48),
    GMSG_LOAD_NATIVE_AD_POLICY_VIOLATIONS(49),
    GMSG_SHOW_VALIDATOR_OVERLAY(50),
    GMSG_IN_MEMORY_SDK_CORE_DATA(51),
    GMSG_PERSISTENT_SDK_CORE_DATA(52),
    GMSG_FLUID_HEIGHT(53),
    GMSG_NATIVE_IMPRESSION_FLOW_CONTROL(54),
    UNRECOGNIZED(-1);

    public final int a;

    po0(int i) {
        this.a = i;
    }

    @Override // saneness.salutatory
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        StringBuilder sb = new StringBuilder("<");
        cyclery.attabal(po0.class, sb, '@').append(Integer.toHexString(System.identityHashCode(this)));
        if (this != UNRECOGNIZED) {
            sb.append(" number=");
            sb.append(getNumber());
        }
        sb.append(" name=");
        sb.append(name());
        sb.append('>');
        return sb.toString();
    }
}
