package com.facebook.appevents.integrity;

import com.applovin.sdk.AppLovinEventParameters;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.appevents.internal.AppLinkManager;
import com.facebook.appevents.internal.Constants;
import com.ironsource.X3;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.util.HashSet;
import jk.a;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import xj.g0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Ljava/util/HashSet;", "", "Lkotlin/collections/HashSet;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class ProtectedModeManager$defaultStandardParameterNames$2 extends o implements a {
    public static final ProtectedModeManager$defaultStandardParameterNames$2 INSTANCE = new ProtectedModeManager$defaultStandardParameterNames$2();

    public ProtectedModeManager$defaultStandardParameterNames$2() {
        super(0);
    }

    @Override // jk.a
    public final HashSet<String> invoke() {
        return g0.t0("_currency", AppEventsConstants.EVENT_PARAM_VALUE_TO_SUM, "fb_availability", "fb_body_style", "fb_checkin_date", "fb_checkout_date", "fb_city", "fb_condition_of_vehicle", "fb_content_ids", AppEventsConstants.EVENT_PARAM_CONTENT_TYPE, "fb_contents", "fb_country", AppEventsConstants.EVENT_PARAM_CURRENCY, "fb_delivery_category", "fb_departing_arrival_date", "fb_departing_departure_date", "fb_destination_airport", "fb_destination_ids", "fb_dma_code", "fb_drivetrain", "fb_exterior_color", "fb_fuel_type", "fb_hotel_score", "fb_interior_color", "fb_lease_end_date", "fb_lease_start_date", "fb_listing_type", "fb_make", "fb_mileage.unit", "fb_mileage.value", "fb_model", "fb_neighborhood", "fb_num_adults", "fb_num_children", "fb_num_infants", AppEventsConstants.EVENT_PARAM_NUM_ITEMS, AppEventsConstants.EVENT_PARAM_ORDER_ID, "fb_origin_airport", "fb_postal_code", "fb_predicted_ltv", "fb_preferred_baths_range", "fb_preferred_beds_range", "fb_preferred_neighborhoods", "fb_preferred_num_stops", "fb_preferred_price_range", "fb_preferred_star_ratings", "fb_price", "fb_property_type", "fb_region", "fb_returning_arrival_date", "fb_returning_departure_date", "fb_state_of_vehicle", "fb_suggested_destinations", "fb_suggested_home_listings", "fb_suggested_hotels", "fb_suggested_jobs", "fb_suggested_local_service_businesses", "fb_suggested_location_based_items", "fb_suggested_vehicles", "fb_transmission", "fb_travel_class", "fb_travel_end", "fb_travel_start", "fb_trim", "fb_user_bucket", "fb_value", "fb_vin", "fb_year", "lead_event_source", "predicted_ltv", "product_catalog_id", "app_user_id", X3.j.W, Constants.EVENT_NAME_EVENT_KEY, "_eventName_md5", "_implicitlyLogged", "_inBackground", "_isTimedEvent", Constants.LOG_TIME_APP_EVENT_KEY, "_session_id", "_ui", "_valueToUpdate", com.facebook.appevents.codeless.internal.Constants.IS_CODELESS_EVENT_KEY, "_is_suggested_event", "_fb_pixel_referral_id", "fb_pixel_id", "trace_id", "subscription_id", "event_id", "_restrictedParams", "_onDeviceParams", "purchase_valid_result_type", "core_lib_included", "login_lib_included", "share_lib_included", "place_lib_included", "messenger_lib_included", "applinks_lib_included", "marketing_lib_included", "_codeless_action", "sdk_initialized", "billing_client_lib_included", "billing_service_lib_included", "user_data_keys", "device_push_token", "fb_mobile_pckg_fp", "fb_mobile_app_cert_hash", "aggregate_id", "anonymous_id", AppLinkManager.CAMPAIGN_IDS_KEY, "add_to_messaging_customer_base_for_whatsapp", "fb_post_attachment", AppLovinEventParameters.IN_APP_PURCHASE_DATA, "ad_type", AppEventsConstants.EVENT_PARAM_CONTENT, AppEventsConstants.EVENT_PARAM_CONTENT_ID, AppEventsConstants.EVENT_PARAM_DESCRIPTION, AppEventsConstants.EVENT_PARAM_LEVEL, AppEventsConstants.EVENT_PARAM_MAX_RATING_VALUE, AppEventsConstants.EVENT_PARAM_PAYMENT_INFO_AVAILABLE, AppEventsConstants.EVENT_PARAM_REGISTRATION_METHOD, AppEventsConstants.EVENT_PARAM_SUCCESS, "pm", "_audiencePropertyIds", "cs_maca");
    }
}
