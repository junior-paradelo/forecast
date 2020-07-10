let myMap = L.map('myMap').setView([43.37135, -8.396], 13)

L.tileLayer('https://{s}.tile.openstreetmap.org/{z}/{x}/{y}.png', {
	maxZoom: 18,
}).addTo(myMap);

let marker = L.marker([43.37135, -8.396]).addTo(myMap)