package com.prasad.test.javaClasses;

import com.google.maps.DistanceMatrixApiRequest;
import com.google.maps.GeoApiContext;
import com.google.maps.model.DistanceMatrix;
import com.google.maps.model.DistanceMatrixElement;
import com.google.maps.model.DistanceMatrixRow;
import com.google.maps.model.LatLng;
import com.google.maps.model.TravelMode;
import com.google.maps.model.Unit;

public class GoogleDistance {

	public static void main(String[] args) {
		GeoApiContext context = new GeoApiContext.Builder().apiKey("AIzaSyBYFW35RkrX6XEQXVmB_1OwdKwXMlcq44A").build();
		DistanceMatrix awaitIgnoreError = new DistanceMatrixApiRequest(context)
				.origins("17.440272,78.3612996|17.4519913,78.3612996")
				.destinations(new LatLng(17.4518091, 78.3817365), new LatLng(107.440232, 78.3612996)).units(Unit.METRIC)
				.mode(TravelMode.DRIVING).awaitIgnoreError();
		DistanceMatrixRow[] rows = awaitIgnoreError.rows;
		// System.out.println(rows[0].elements[0].distance.inMeters);

		for (DistanceMatrixRow distanceMatrixRow : rows) {
			DistanceMatrixElement[] elements = distanceMatrixRow.elements;
			for (DistanceMatrixElement element : elements) {
				try {
					System.out.println(element.distance.inMeters);

				} catch (Exception e) {
					// TODO: handle exception
					System.out.println(e.getMessage() + " ----");
				}
			}
		}
		/*
		 * for (DistanceMatrixRow distanceMatrixRow : rows) { DistanceMatrixElement[]
		 * elements = distanceMatrixRow.elements; for (DistanceMatrixElement element :
		 * elements) { } }
		 * 
		 * 
		 * request.setCallback(new PendingResult.Callback<DistanceMatrix>() {
		 * 
		 * @Override public void onResult(DistanceMatrix result) {
		 * 
		 * DistanceMatrixRow[] rows = result.rows;
		 * System.out.println(rows[0].elements[0].distance.inMeters); return; }
		 * 
		 * @Override public void onFailure(Throwable e) { // Handle error.
		 * System.out.println(e.getMessage()); } }); try { Thread.sleep(1000); } catch
		 * (InterruptedException e1) { // TODO Auto-generated catch block
		 * e1.printStackTrace(); }
		 */

	}

}
