'use strict';
import React, { PropTypes, Component } from 'react';
import {
    DeviceEventEmitter,
    NativeModules,
    Platform,
    NativeAppEventEmitter,
    AppState
} from 'react-native'

var updateAppModuleObj = NativeModules.UpdateAppModule;

class updateApp {
  constructor () {
  }

  /**
  * android下载apk
  */
  downloadApp(apkUrl) {
      updateAppModuleObj.downloadApp(apkUrl);
  }

  /**
  * iOS打开appstore
  */
  openAPPStore(appStoreId) {
      updateAppModuleObj.openAPPStore(appStoreId);
  }

}
export default new updateApp();
