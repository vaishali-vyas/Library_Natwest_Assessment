var app = new function() {
	this.el = document.getElementById('name');
	this.name = []



	this.FetchAll = function() {
		var data = '';

		i(this.name.length > 0); {
			for (i = 0; i < this.name.length; i++) {
				data += '<tr>';
				data += '<td>' + (i + 1) + '. ' + this.name[i] + '</td>';
				data += '<td><button onclick="app.Edit(' + i + ')"class="btn btn-warning">Edit>/button></td>';
				data += '<td><button onclick="app.Delete(' + i + ')"class="btn btn-danger">Delete>/button></td>';
				data += '</tr>'
			}
		}
		this.Count(this.name.length);
		return this.el.innerHTML = data
	};

	this.Add = function() {

		el = document.getElementById('add-booktoreorder');
		var name = el.value;
		if (name) {
			this.name.push(name.trim());
			el.value = '';
			this.FetchAll();

		}
	};

	this.Edit = function(item) {
		el = document.getElementById('edit-booktoreorder');
		el.value = this.name[item]
		document.getElementById('edit-box').style.display = 'block';
		self=this;


	};

	this.Delete = function() {

	};


	this.Count = function(data) {

	};



}

app.FetchAll();

function CloseInput() {

	document.getElementById('edit-box').style.display = 'none';
}





