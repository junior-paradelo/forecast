const locations = [
	["SENSOR_1", 43.34718400, -8.38639700],
	["SENSOR_2", 43.33265000, -8.40794000],
	["SENSOR_3", 43.33258000, -8.40795000],
	["SENSOR_4", 43.37051100, -8.42031900],
	["SENSOR_5", 43.33253000, -8.40795000]
];

var mymap = L.map('mapid').setView([43.37135, -8.396], 13);

L.tileLayer('https://{s}.tile.openstreetmap.org/{z}/{x}/{y}.png', {
	attribution: 'Map data &copy; <a href="https://www.openstreetmap.org/">OpenStreetMap</a>',
	maxZoom: 18
}).addTo(mymap);

function showLocations() {
	for (var i = 0; i < locations.length; i++) {
		marker = new L.marker([locations[i][1], locations[i][2]]).bindPopup(locations[i][0]).addTo(mymap);
	}
}

