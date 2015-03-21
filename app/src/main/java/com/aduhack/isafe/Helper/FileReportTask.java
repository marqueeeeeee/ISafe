package com.aduhack.isafe.Helper;

import android.os.AsyncTask;

import com.aduhack.isafe.Model.ReportModel;

/**
 * Created by Jee.Gloria on 3/21/2015.
 */
public class FileReportTask extends AsyncTask<Void, Void, String>
{

    HttpManager hm;
    // DataHelper dh;
    // ReservationModel rm;
    ReportModel report;
    public FileReportTask(ReportModel _report) {
//            dh = new DataHelper(context);
//            dh.open();
        report = _report;
        hm = new HttpManager();
//            rm = model;
    }

    @Override
    protected String doInBackground(Void... params) {
         hm.FileReport(report);
        return "Okay";
    }

    @Override
    protected void onPostExecute(String result) {
        super.onPostExecute(result);
//            dh.close();
//            Toast.makeText(getApplicationContext(), "Your order is being processed, please wait for confirmation! have a nice day!", Toast.LENGTH_SHORT).show();
//            PD.dismiss();
//            finish();
    }



}
