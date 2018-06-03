var Mock = require('mockjs');
var express = require('express');
var app = express();

// respond with "hello world" when a GET request is made to the homepage
app.get('/api/tableData', function(req, res) {

    var data = Mock.mock({
            'code':0,
            'msg': 'nothing',
            'count': 1000,
            'data|1-1000': [{
                'name': '@character',
                'contact_name': '@character',
                'contact_phone': '18588557892',
                'create_time': '@DATETIME',
                'update_time': '@DATETIME',
                'status_data': '阿斯顿'
            }]
        });
    res.header('Access-Control-Allow-Origin', '*');
    res.json(data);
});

app.post('/api/tableData', function(req, res) {

    var data = Mock.mock({
            'code':0,
            'msg': 'nothing',
            'count': 1000,
            'data|1-1000': [{
                'name': '@character',
                'contact_name': '@character',
                'contact_phone': '18588557892',
                'create_time': '@DATETIME',
                'update_time': '@DATETIME',
                'status_data': '阿斯顿'
            }]
        });
    res.header('Access-Control-Allow-Origin', '*');
    res.json(data);
});


var server = app.listen(3000, function () {
    var host = server.address().address;
    var port = server.address().port;

    console.log('Example app listening at http://%s:%s', host, port);
});

