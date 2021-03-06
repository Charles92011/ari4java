package ch.loway.oss.ari4java.generated.ari_0_0_1.actions;

// ----------------------------------------------------
//      THIS CLASS WAS GENERATED AUTOMATICALLY         
//               PLEASE DO NOT EDIT                    
//    Generated on: Tue Dec 19 09:55:49 CET 2017
// ----------------------------------------------------

import ch.loway.oss.ari4java.generated.*;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import ch.loway.oss.ari4java.tools.BaseAriAction;
import ch.loway.oss.ari4java.tools.RestException;
import ch.loway.oss.ari4java.tools.AriCallback;
import ch.loway.oss.ari4java.tools.HttpParam;
import ch.loway.oss.ari4java.tools.HttpResponse;
import com.fasterxml.jackson.core.type.TypeReference;
import ch.loway.oss.ari4java.generated.ari_0_0_1.models.*;

/**********************************************************
 * 
 * Generated by: Apis
 *********************************************************/


public class ActionDeviceStates_impl_ari_0_0_1 extends BaseAriAction  implements ActionDeviceStates {
/**********************************************************
 * Device states
 * 
 * List all ARI controlled device states.
 *********************************************************/
private void buildList() {
reset();
url = "/deviceStates";
method = "GET";
}

@Override
public List<DeviceState> list() throws RestException {
buildList();
String json = httpActionSync();
return deserializeJsonAsAbstractList( json,
   new TypeReference<List<DeviceState_impl_ari_0_0_1>>() {} ); 
}

@Override
public void list(AriCallback<List<DeviceState>> callback) {
buildList();
httpActionAsync(callback, new TypeReference<List<DeviceState_impl_ari_0_0_1>>() {});
}

/**********************************************************
 * Device state
 * 
 * Retrieve the current state of a device.
 *********************************************************/
private void buildGet(String deviceName) {
reset();
url = "/deviceStates/" + deviceName + "";
method = "GET";
}

@Override
public DeviceState get(String deviceName) throws RestException {
buildGet(deviceName);
String json = httpActionSync();
return deserializeJson( json, DeviceState_impl_ari_0_0_1.class ); 
}

@Override
public void get(String deviceName, AriCallback<DeviceState> callback) {
buildGet(deviceName);
httpActionAsync(callback, DeviceState_impl_ari_0_0_1.class);
}

/**********************************************************
 * Device state
 * 
 * Change the state of a device controlled by ARI. (Note - implicitly creates the device state).
 *********************************************************/
private void buildUpdate(String deviceName, String deviceState) {
reset();
url = "/deviceStates/" + deviceName + "";
method = "PUT";
lParamQuery.add( HttpParam.build( "deviceState", deviceState) );
lE.add( HttpResponse.build( 404, "Device name is missing") );
lE.add( HttpResponse.build( 409, "Uncontrolled device specified") );
}

@Override
public void update(String deviceName, String deviceState) throws RestException {
buildUpdate(deviceName, deviceState);
String json = httpActionSync();
}

@Override
public void update(String deviceName, String deviceState, AriCallback<Void> callback) {
buildUpdate(deviceName, deviceState);
httpActionAsync(callback);
}

/**********************************************************
 * Device state
 * 
 * Destroy a device-state controlled by ARI.
 *********************************************************/
private void buildDelete(String deviceName) {
reset();
url = "/deviceStates/" + deviceName + "";
method = "DELETE";
lE.add( HttpResponse.build( 404, "Device name is missing") );
lE.add( HttpResponse.build( 409, "Uncontrolled device specified") );
}

@Override
public void delete(String deviceName) throws RestException {
buildDelete(deviceName);
String json = httpActionSync();
}

@Override
public void delete(String deviceName, AriCallback<Void> callback) {
buildDelete(deviceName);
httpActionAsync(callback);
}

/** No missing signatures from interface */
};

